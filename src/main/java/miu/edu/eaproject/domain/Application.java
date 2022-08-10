package miu.edu.eaproject.domain;


import javax.persistence.*;

@Entity
public class Application {
    @Id
    @GeneratedValue
    private int id;
    private int resumeVersion;

    @OneToOne( cascade = CascadeType.PERSIST)
    private Job job;

    public Application(int resumeVersion,Job job) {
        this.job = job;
        this.resumeVersion = resumeVersion;
    }
    public Application(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResumeVersion() {
        return resumeVersion;
    }

    public void setResumeVersion(int resumeVersion) {
        this.resumeVersion = resumeVersion;
    }
}
