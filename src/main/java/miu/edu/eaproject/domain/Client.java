package miu.edu.eaproject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue
    private int id;

    private String mission;
    private String reason;
    private String website;

    public Client(String mission, String reason, String website) {
        this.mission = mission;
        this.reason = reason;
        this.website = website;
    }

    public Client() {

    }

    public int getId() {
        return id;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
