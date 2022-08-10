package miu.edu.eaproject.domain;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Application {
    @Id
    @GeneratedValue
    private int id;
    private int resumeVersion;
    @JsonProperty(value = "job")
    @OneToOne( cascade = CascadeType.ALL)
    private Job job;

    public Application(int resumeVersion,Job job) {
        this.job = job;
        this.resumeVersion = resumeVersion;
    }
    public Application(){}

    public int getId() {
        return id;
    }


    public int getResumeVersion() {
        return resumeVersion;
    }

    public void setResumeVersion(int resumeVersion) {
        this.resumeVersion = resumeVersion;
    }
}
