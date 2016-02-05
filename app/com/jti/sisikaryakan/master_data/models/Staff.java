package com.jti.sisikaryakan.master_data.models;

import com.jti.sisikaryakan.support.Gender;

/**
 * Created by User on 2/5/2016.
 */
public class Staff extends Employee{

    private Employee supervisor;
    private String categoryStaff;
    private Integer lodgmentAllowance;
    private Integer internetAllowance;

    public Staff(Employee supervisor,
                 String firstName, String lastName, Gender gender,
                 Byte age, String categoryStaff,Integer lodgmentAllowance,
                 Integer internetAllowance,
                 Integer transportAllowance,
                 Integer basicSalary, String assignment,
                 String address) {

        super(firstName, lastName, gender, age, "STAFF "+categoryStaff.toUpperCase(),
                transportAllowance, basicSalary, assignment, address);

        this.supervisor=supervisor;
        this.categoryStaff=categoryStaff;
        this.lodgmentAllowance=lodgmentAllowance;
        this.internetAllowance=internetAllowance;
    }


    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public String getCategoryStaff() {
        return categoryStaff;
    }

    public void setCategoryStaff(String categoryStaff) {
        this.categoryStaff = categoryStaff;
    }

    public Integer getLodgmentAllowance() {
        return lodgmentAllowance;
    }

    public void setLodgmentAllowance(Integer lodgmentAllowance) {
        this.lodgmentAllowance = lodgmentAllowance;
    }

    public Integer getInternetAllowance() {
        return internetAllowance;
    }

    public void setInternetAllowance(Integer internetAllowance) {
        this.internetAllowance = internetAllowance;
    }
}
