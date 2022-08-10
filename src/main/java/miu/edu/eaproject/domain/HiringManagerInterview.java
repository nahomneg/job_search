package miu.edu.eaproject.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class HiringManagerInterview extends Interview {
    @Id
    @GeneratedValue
    private int id;
    private int teamSize;
    private LocalDate startDate;

    public HiringManagerInterview(LocalDate date, String phone, String email,int teamSize, LocalDate startDate) {
        super(date,phone,email);
        this.teamSize = teamSize;
        this.startDate = startDate;
    }

    public HiringManagerInterview() {
    }

    public int getId() {
        return id;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
