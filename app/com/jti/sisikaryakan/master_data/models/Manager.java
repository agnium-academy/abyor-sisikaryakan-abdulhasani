package com.jti.sisikaryakan.master_data.models;

import com.jti.sisikaryakan.support.Gender;

/**
 * Created by User on 2/5/2016.
 */
public class Manager extends Employee{

    private String categoryManager;

    public Manager(String firstName, String lastName,
                   Gender gender, Byte age,
                   String categoryManager, Integer transportAllowance,
                   Integer basicSalary, String assignment,
                    String address) {


        super(firstName, lastName, gender, age, "MANAGER "+categoryManager.toUpperCase(), transportAllowance,
                basicSalary, assignment, address);
    }

    public String getCategoryManager() {
        return categoryManager;
    }

    public void setCategoryManager(String categoryManager) {
        this.categoryManager = categoryManager;
    }
}
