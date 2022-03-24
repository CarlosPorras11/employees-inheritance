package org.iesfm.employees;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public abstract class Employee {
    private final static Logger log = LoggerFactory.getLogger(Employee.class);


    private String nif;
    private String name;
    private String surname;
    private int workedHours;

    public Employee(String nif, String name, String surname, int workedHours) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.workedHours = workedHours;
    }

    public void showInfo(){
        showEmployeeType();
        log.info("Nif: " + nif);
        log.info("Nombre: " + name);
        log.info("Apellido: " + surname);
        log.info("Horas trabajadas: " + workedHours);
        showSpecificInfo();
    }

    public void hours(int hour){
        workedHours += hour;
    }

    public abstract void showEmployeeType();
    public abstract void showSpecificInfo();

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return workedHours == employee.workedHours && Objects.equals(nif, employee.nif) && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, workedHours);
    }

    @Override
    public String toString() {
        return "org.iesfm.employees.Employee{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", workedHours=" + workedHours +
                '}';
    }
}
