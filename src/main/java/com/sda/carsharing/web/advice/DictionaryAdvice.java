package com.sda.carsharing.web.advice;

import com.sda.carsharing.model.enums.*;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class DictionaryAdvice {

    @ModelAttribute("fuels")
    public List<Fuel> getFuels() {
        return Arrays.asList(Fuel.values());
    }

    @ModelAttribute("gearType")
    public List<Gear> getGearTypes() {
        return Arrays.asList(Gear.values());
    }

    @ModelAttribute("bodyType")
    public List<BodyType> getBodyTypes() {
        return Arrays.asList(BodyType.values());
    }

    @ModelAttribute("carClasses")
    public List<CarClass> getCarClasses() {
        return Arrays.asList(CarClass.values());
    }

    @ModelAttribute("color")
    public List<Color> getColors() {
        return Arrays.asList(Color.values());
    }

    @ModelAttribute("status")
    public List<Status> getStatus() {
        return Arrays.asList(Status.values());
    }

    @ModelAttribute("role")
    public List<Role> getRole(){
        return Arrays.asList((Role.values()));
    }
}
