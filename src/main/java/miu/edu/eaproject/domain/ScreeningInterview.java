package miu.edu.eaproject.domain;

import javax.persistence.Entity;

import java.time.LocalDate;

@Entity
public class ScreeningInterview extends Interview {

    private String name;
    private boolean result;

    public ScreeningInterview(LocalDate date, String phone, String email, String name, boolean result) {
        super(date, phone, email);
        this.name = name;
        this.result = result;
    }

    public ScreeningInterview() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
