package miu.edu.eaproject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

@Entity
public class Recruiter extends Company{
    @GeneratedValue
    @Id
    private int id;

    @OneToMany
    private List<Client> clients;


    public Recruiter(String name, String address, List<Client> clients) {
        super(name, address);
        this.clients = clients;
    }

    public Recruiter() {
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
