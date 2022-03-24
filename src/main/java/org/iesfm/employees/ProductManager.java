package org.iesfm.employees;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class ProductManager extends Employee{
    private final static Logger log = LoggerFactory.getLogger(ProductManager.class);

    private String project;

    public ProductManager(String nif, String name, String surname, int workedHours, String project) {
        super(nif, name, surname, workedHours);
        this.project = project;
    }

    @Override
    public void showEmployeeType() {
        log.info("Manager de Producto");
    }

    @Override
    public void showSpecificInfo() {
        log.info("Proyecto: " + project);
    }


    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductManager that = (ProductManager) o;
        return Objects.equals(project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), project);
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "project='" + project + '\'' +
                '}';
    }
}
