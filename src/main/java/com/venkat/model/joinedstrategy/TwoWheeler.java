package com.venkat.model.joinedstrategy;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Venkatram on 8/26/2017.
 */

@Entity
@Table(name="two_jwheeler")
public class TwoWheeler extends Vehicle {

    private String SteeringHandle;

    public String getSteeringHandle() {
        return SteeringHandle;
    }

    public void setSteeringHandle(String steeringHandle) {
        SteeringHandle = steeringHandle;
    }
}
