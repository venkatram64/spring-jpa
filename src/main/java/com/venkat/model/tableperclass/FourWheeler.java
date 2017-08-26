package com.venkat.model.tableperclass;

import javax.persistence.*;

/**
 * Created by Venkatram on 8/26/2017.
 */
@Entity
@Table(name="four_twheeler")
public class FourWheeler extends Vehicle {

    private String SteeringWheel;

    public String getSteeringWheel() {
        return SteeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        SteeringWheel = steeringWheel;
    }
}
