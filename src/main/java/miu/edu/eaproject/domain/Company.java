package miu.edu.eaproject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public abstract class Company {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String address;

    @OneToMany
    private List<Job> jobs;

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public Company(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
