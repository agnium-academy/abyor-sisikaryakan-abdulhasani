package com.jti.sisikaryakan.master_data.models;

import com.jti.sisikaryakan.support.Gender;

/**
 * Created by User on 2/5/2016.
 */
public  class Employee {

    private String firstName;
    private String lastName;
    private String fullName;
    private Gender gender;
    private Byte age;
    private String employment;
    private Integer transportAllowance;
    private Integer basicSalary;
    private String assignment;
    private String address;

    public Employee(String firstName, String lastName,
                    Gender gender, Byte age, String employment,
                    Integer transportAllowance, Integer basicSalary,
                    String assignment, String address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.gender = gender;
        this.age = age;
        this.employment = employment.toUpperCase();
        this.transportAllowance = transportAllowance;
        this.basicSalary = basicSalary;
        this.assignment = assignment;
        this.address = address;
    }
    /**
     */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String firstName, String lastName) {
        this.fullName = firstName + " " + lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public Integer getTransportAllowance() {
        return transportAllowance;
    }

    public void setTransportAllowance(Integer transportAllowance) {
        this.transportAllowance = transportAllowance;
    }

    public Integer getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Integer basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
