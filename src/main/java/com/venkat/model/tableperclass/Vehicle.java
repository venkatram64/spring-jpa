package com.venkat.model.tableperclass;

import javax.persistence.*;

/**
 * Created by Venkatram on 8/26/2017.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name="tvehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    private String vehicleName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
