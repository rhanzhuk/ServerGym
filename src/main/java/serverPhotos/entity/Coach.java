package serverPhotos.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "coach")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Coach {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "login")
    private String login;
    @Column (name = "password")
    private String password;


    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
    private SportClub sportClub;

    @Column
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "coach")
    private List<Client> clients;

    @Column
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "coach")
    List<Training> trainingList;

    public Coach(String name, String login, String password, SportClub sportClub, List<Client> clients, List<Training> trainingList) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.sportClub = sportClub;
        this.clients = clients;
        this.trainingList = trainingList;
    }

    public Coach(){}

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPessword() {
        return password;
    }

    public void setPessword(String pessword) {
        this.password = pessword;
    }

    public SportClub getSportClub() {
        return sportClub;
    }

    public void setSportClub(SportClub sportClub) {
        this.sportClub = sportClub;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Training> getTrainingList() {
        return trainingList;
    }

    public void setTrainingList(List<Training> trainingList) {
        this.trainingList = trainingList;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", sportClub=" + sportClub +
                ", clients=" + clients +
                ", trainingList=" + trainingList +
                '}';
    }
}
