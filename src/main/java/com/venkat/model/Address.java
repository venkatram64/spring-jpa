package com.venkat.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by venkatram.veerareddy on 8/23/2017.
 */

@Entity
@Table(name="Address")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name="LINE1")
    private String line1;

    @Column(name="LINE2")
    private String line2;

    @Column(name="ZIP_CODE")
    private String zipCode;

    @OneToOne(mappedBy = "address")
    private Employee employee;

    public Address(){}

    public Address(String line1, String line2, String zipCode) {
        this.line1 = line1;
        this.line2 = line2;
        this.zipCode = zipCode;
    }

    public Address(String line1, String line2, String zipCode, Employee employee) {
        this.line1 = line1;
        this.line2 = line2;
        this.zipCode = zipCode;
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
