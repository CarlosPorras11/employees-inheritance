package org.iesfm.employees;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TechDirector extends Employee{
    private final static Logger log = LoggerFactory.getLogger(TechDirector.class);

    public TechDirector(String nif, String name, String surname, int workedHours) {
        super(nif, name, surname, workedHours);
    }

    @Override
    public void showEmployeeType() {
        log.info("Director de tecnología");
    }

    @Override
    public void showSpecificInfo() {
    }
}
