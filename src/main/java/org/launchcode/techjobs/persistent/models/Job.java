package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;

@Entity
public class Job extends AbstractEntity {

    private String employer;
    private String skills;

    public Job(String anEmployer, String someSkills) {
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    public Job () {}

    // Getters and setters.

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
