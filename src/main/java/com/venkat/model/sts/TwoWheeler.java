package com.venkat.model.sts;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Venkatram on 8/26/2017.
 */

@Entity
@DiscriminatorValue("Bike")
public class TwoWheeler extends Vehicle {

    private String SteeringHandle;

    public String getSteeringHandle() {
        return SteeringHandle;
    }

    public void setSteeringHandle(String steeringHandle) {
        SteeringHandle = steeringHandle;
    }
}
