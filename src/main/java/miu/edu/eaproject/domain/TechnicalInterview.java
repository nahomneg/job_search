package miu.edu.eaproject.domain;


import javax.persistence.Entity;
import javax.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

@Entity
public class TechnicalInterview extends Interview {
    private int duration;
    private Location location;
    @OneToMany
    private List<Question> questions;

    public TechnicalInterview() {

    }


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public TechnicalInterview(LocalDate date, String phone, String email,int duration, Location location, List<Question> questions) {
        super(date,phone,email);
        this.duration = duration;
        this.location = location;
        this.questions = questions;
    }
}
