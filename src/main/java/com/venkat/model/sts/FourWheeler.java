package com.venkat.model.sts;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Venkatram on 8/26/2017.
 */

@Entity
@DiscriminatorValue("Car")
public class FourWheeler extends Vehicle {

    private String SteeringWheel;

    public String getSteeringWheel() {
        return SteeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        SteeringWheel = steeringWheel;
    }
}
