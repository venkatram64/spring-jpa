package com.venkat.model.joinedstrategy;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Venkatram on 8/26/2017.
 */

@Entity
@Table(name="four_jwheeler")
public class FourWheeler extends Vehicle {

    private String SteeringWheel;

    public String getSteeringWheel() {
        return SteeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        SteeringWheel = steeringWheel;
    }
}
