package serverPhotos.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "training")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Training {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "training_date")
    private Date trainingDate;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "client_id", nullable = false,  insertable = false, updatable = false)
    private Client client;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "coach_id", nullable = false, insertable = false, updatable = false)
    private Coach coach;

    public Training(String name, Date trainingDate, Client client, Coach coach) {
        this.name = name;
        this.trainingDate = trainingDate;
        this.client = client;
        this.coach = coach;
    }

    public Training(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(Date trainingDate) {
        this.trainingDate = trainingDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", trainingDate=" + trainingDate +
                ", client=" + client +
                ", coach=" + coach +
                '}';
    }
}
