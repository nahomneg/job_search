package miu.edu.eaproject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Skill {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int experience;
    private String description;
    private String language;

    @ManyToOne()
    private Job job;

    public Skill() {

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Skill(String name, int experience, String description, String language) {
        this.name = name;
        this.experience = experience;
        this.description = description;
        this.language = language;
    }
}
