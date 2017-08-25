package com.venkat.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by venkatram.veerareddy on 8/25/2017.
 */

@Entity
@Table(name="Bank")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    //owning table
    //@OneToMany
    //@JoinColumn(name="customer_id") for only uni directional
    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    private List<Customer> customers = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
