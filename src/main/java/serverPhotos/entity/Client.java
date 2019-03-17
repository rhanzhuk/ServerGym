package serverPhotos.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import serverPhotos.entity.enums.Levels;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "client")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Client {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "age")
    private int age;
    @Column(name = "email")
    private String email;
    @Column(name = "level")
    private Levels level;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id", nullable = false,  insertable = false, updatable = false)
    private Coach coach;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "client")
    List<Training> trainingList;

    public Client(String name, String login, String password, int age, String email, Levels level, Coach coach, List<Training> trainingList) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.age = age;
        this.email = email;
        this.level = level;
        this.coach = coach;
        this.trainingList = trainingList;
    }

    public Client() {
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Levels getLevel() {
        return level;
    }

    public void setLevel(Levels level) {
        this.level = level;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public List<Training> getTrainingList() {
        return trainingList;
    }

    public void setTrainingList(List<Training> trainingList) {
        this.trainingList = trainingList;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", level=" + level +
                ", coach=" + coach +
                ", trainingList=" + trainingList +
                '}';
    }

}
