package com.venkat.model.tableperclass;

import javax.persistence.*;

/**
 * Created by Venkatram on 8/26/2017.
 */

@Entity
@Table(name="two_twheeler")
public class TwoWheeler extends Vehicle {

    private String SteeringHandle;

    public String getSteeringHandle() {
        return SteeringHandle;
    }

    public void setSteeringHandle(String steeringHandle) {
        SteeringHandle = steeringHandle;
    }
}
