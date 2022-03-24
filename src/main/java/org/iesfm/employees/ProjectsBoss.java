package org.iesfm.employees;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;
import java.util.Objects;

public class ProjectsBoss extends Employee{
    private final static Logger log = LoggerFactory.getLogger(ProjectsBoss.class);

    private Set<String> projects;

    public ProjectsBoss(String nif, String name, String surname, int workedHours, Set<String> projects) {
        super(nif, name, surname, workedHours);
        this.projects = projects;
    }

    public boolean checkProjects(String project){
        return projects.contains(project);
    }

    @Override
    public void showEmployeeType() {
        log.info("Jefe de proyecto");
    }

    @Override
    public void showSpecificInfo() {
        for (String project: projects) {
            log.info("El proyecto en el que trabaja es: " + project);
        }
    }


    public Set<String> getProjects() {
        return projects;
    }

    public void setProjects(Set<String> projects) {
        this.projects = projects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProjectsBoss that = (ProjectsBoss) o;
        return Objects.equals(projects, that.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), projects);
    }

    @Override
    public String toString() {
        return "ProjectsBoss{" +
                "projects=" + projects +
                '}';
    }
}
