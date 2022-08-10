package miu.edu.eaproject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.time.LocalDate;
@Entity
public class Interview {
    @GeneratedValue
    @Id
    private int id;
    private LocalDate date;

    public Interview() {

    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String phone;
    private String email;

    public Interview(LocalDate date, String phone, String email) {
        this.date = date;
        this.phone = phone;
        this.email = email;
    }
}
