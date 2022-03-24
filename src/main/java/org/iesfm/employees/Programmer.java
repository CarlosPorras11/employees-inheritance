package org.iesfm.employees;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;
import java.util.Objects;

public class Programmer extends Employee {

    private final static Logger log = LoggerFactory.getLogger(Programmer.class);

    private Set<String> programmingLanguajes;
    private String project;

    public Programmer(String nif, String name, String surname, int workedHours,
                      Set<String> programmingLanguajes, String project) {
        super(nif, name, surname, workedHours);
        this.programmingLanguajes = programmingLanguajes;
        this.project = project;
    }

    public boolean checkingProgrammingLanguaje(String languaje) {
        return programmingLanguajes.contains(languaje);
    }

    @Override
    public void showEmployeeType() {
        log.info("Programador");
    }

    @Override
    public void showSpecificInfo() {
        for (String languaje: programmingLanguajes) {
            log.info("El lenguaje de programacion que conoce es: " + languaje);
        }
        log.info("Proyecto: " + project);
    }

    public Set<String> getProgrammingLanguajes() {
        return programmingLanguajes;
    }

    public void setProgrammingLanguajes(Set<String> programmingLanguajes) {
        this.programmingLanguajes = programmingLanguajes;
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
        Programmer that = (Programmer) o;
        return Objects.equals(programmingLanguajes, that.programmingLanguajes) && Objects.equals(project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), programmingLanguajes, project);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmingLanguajes=" + programmingLanguajes +
                ", project='" + project + '\'' +
                '}';
    }
}
