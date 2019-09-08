package com.sda.carsharing.web.advice;

import com.sda.carsharing.model.enums.BodyType;
import com.sda.carsharing.model.enums.CarClass;
import com.sda.carsharing.model.enums.Fuel;
import com.sda.carsharing.model.enums.Gear;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class DictionaryAdvice {

    @ModelAttribute("fuels")
    public List<Fuel> getFuels () {
        return Arrays.asList(Fuel.values());
    }

    @ModelAttribute("gearType")
    public List<Gear> getGearTypes(){
        return Arrays.asList(Gear.values());
    }

    @ModelAttribute("bodyType")
    public List<BodyType> getBodyTypes(){
        return Arrays.asList(BodyType.values());
    }

    @ModelAttribute("carClasses")
    public List<CarClass> getCarClasses(){
        return Arrays.asList(CarClass.values());
    }
}
