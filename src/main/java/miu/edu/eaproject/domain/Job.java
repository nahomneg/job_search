package miu.edu.eaproject.domain;


import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Job {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private double salary;
    

    @OneToOne
    private ScreeningInterview screeningInterview;

    @OneToOne
    private HiringManagerInterview hiringManagerInterview;

    @OneToOne
    private TechnicalInterview technicalInterview;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Skill> skills = new HashSet<>();

    public Job(String title, double salary, ScreeningInterview screeningInterview, TechnicalInterview technicalInterview, HiringManagerInterview hiringManagerInterview) {
        this.title = title;
        this.salary = salary;
        this.screeningInterview = screeningInterview;
        this.technicalInterview = technicalInterview;
        this.hiringManagerInterview = hiringManagerInterview;
    }

    public Job() {

    }

    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }


    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
