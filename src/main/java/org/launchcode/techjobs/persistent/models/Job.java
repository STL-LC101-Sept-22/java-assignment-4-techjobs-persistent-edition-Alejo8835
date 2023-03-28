package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    private Employer employer;
    private String skills;

    public Job(Employer employer, String someSkills) {
        this.employer = employer;
        this.skills = someSkills;
    }

    public Job () {}

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getSkills() {

        return skills;
    }

    public void setSkills(String skills) {

        this.skills = skills;
    }
}
