package miu.edu.eaproject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Question {
    @Id
    @GeneratedValue
    private int id;
    String question;

    public Question(int id, String question) {
        this.id = id;
        this.question = question;
    }

    public Question() {

    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
