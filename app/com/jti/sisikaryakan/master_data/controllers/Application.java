package com.jti.sisikaryakan.master_data.controllers;

import com.jti.sisikaryakan.master_data.models.Employee;
import com.jti.sisikaryakan.master_data.models.Manager;
import com.jti.sisikaryakan.master_data.models.Staff;
import com.jti.sisikaryakan.master_data.models.Supervisor;
import com.jti.sisikaryakan.support.Gender;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {


    /**
     * Method default play framework
     *
     * @return
     */
    public static Result index() {

        Employee tegar = registerManager("Mochammad", "Tegar Utomo", Gender.MALE,
                (byte) 23, "Drilling", 10000000, 100000000, "bla bla", "Cilacap");
        Employee iqbal = registerSupervisor(
                tegar, "Moch", "Iqbal Oyonz", "Drilling Riau", Gender.MALE,
                (byte) 23, 3000000, 6000000, 3000000, "bla bla",
                300000000, "ggg", "bla bla");

        Employee dwi = registerStaff(iqbal, "Dwi", "Indi", Gender.FEMALE, (byte) 24, "Drilling Riau",
                5000000,5000000,2000000, 15000000, "oke", "itu");

        return ok(Json.toJson(dwi));
    }


    private static Employee registerStaff(Employee supervisor,
                                          String firstName, String lastName, Gender gender,
                                          Byte age, String categoryStaff,
                                          Integer lodgmentAllowance,
                                          Integer internetAllowance,
                                          Integer transportAllowance,
                                          Integer basicSalary,
                                          String assignment,
                                          String address) {

        Employee staff = new Staff(
                supervisor,
                firstName,
                lastName, gender,
                (byte) age, categoryStaff,lodgmentAllowance,internetAllowance,
                transportAllowance, basicSalary, assignment, address
        );

        return staff;
    }

    /**
     * @return
     */
    private static Employee registerSupervisor(Employee manager, String firstName,
                                               String lastName,
                                               String categorySupervisor,
                                               Gender gender, Byte age,
                                               Integer transportAllowance,
                                               Integer holidayAllowance,
                                               Integer healthBenefits,
                                               String studyComparatif,
                                               Integer basicSalary,
                                               String assignment, String address) {
        Employee supervisor = new Supervisor(
                manager,
                firstName, lastName,
                categorySupervisor, gender, age,
                transportAllowance, holidayAllowance,
                healthBenefits, studyComparatif,
                basicSalary, assignment, address);

        return supervisor;
    }

    /**
     * Pada method ini terdapat proses objek employe
     * yang bentuknya managerdrilling.
     *
     * @return Employee yang merupakan manager
     */
    private static Employee registerManager(String firstName, String lastName,
                                            Gender gender, Byte age,
                                            String categoryManager, Integer transportAllowance,
                                            Integer basicSalary, String assignment,
                                            String address) {
        Employee manager = new Manager(
                firstName, lastName,
                gender, age,
                categoryManager,
                transportAllowance,
                basicSalary, assignment, address);

        return manager;
    }//End scope method registerManagerDrilling


}
