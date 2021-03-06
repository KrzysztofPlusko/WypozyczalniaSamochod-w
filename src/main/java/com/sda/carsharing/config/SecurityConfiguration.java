package com.sda.carsharing.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

import static org.hibernate.criterion.Restrictions.and;

@Configuration
/*
    Nie dodajemy adnotacji @EnableWebSecurity, bo to zostało już zrobione
    przez Spring Boot
 */
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    /*
        Wstrzykiwane jest podstawowe źródło danych, skonfigurowane w pliku application.properties
     */
    private final DataSource dataSource;

    public SecurityConfiguration(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password("{noop}admin").roles("ADMIN")
                .and()
                .withUser("manager").password("{noop}manager").roles("MANAGER")
                .and()
                .withUser("employee").password("{noop}employee").roles("EMPLOYEE");


        //        auth.jdbcAuthentication()
//                .dataSource(dataSource)
//                .passwordEncoder(passwordEncoder())
//                .usersByUsernameQuery("SELECT login, password FROM employees WHERE login = ?")
//                // Role nie są obsługiwane więc mamy "fakowe" zapytanie, które dla każdego użytkownika
//                // zwraca ustaloną z góry rolę 'ROLE_USER'
//                .authoritiesByUsernameQuery("SELECT login, 'ADMIN' FROM employees WHERE login = ?");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/admin/carmodel").hasAnyRole("MANAGER","EMPLOYEE")
                .antMatchers("/admin/carmodel/add").hasRole("MANAGER")
                .anyRequest().authenticated()
                .and()
                .csrf().disable()
                .formLogin()
                .defaultSuccessUrl("/admin/reservation")
                .and()
                .logout()
                .and()
                .httpBasic();
    }
}