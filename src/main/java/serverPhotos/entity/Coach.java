package serverPhotos.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import serverPhotos.entity.enums.Role;
import serverPhotos.entity.enums.Sex;
import serverPhotos.entity.enums.SportCategory;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "coach")
public class Coach {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "sex")
    private Sex sex;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "login")
    private String login;

    @Column (name = "password")
    private String password;

    @Column (name = "photo")
    private String photo;

    @Column(name = "role")
    private Role role;

    @Column(name = "sport_category")
    private SportCategory sportCategory;

    @ManyToMany
    @JoinTable(
            name = "coach_client",
            joinColumns = @JoinColumn(name = "coach_id"),
            inverseJoinColumns = @JoinColumn(name = "client_id"))
    @JsonIgnore
    private Set<Client> clientsSet;

    @ManyToMany(mappedBy = "coachSet")
    //@JsonIgnore
    private Set<SportClub> sportClubSet;

    @ManyToMany
    @JoinTable(
            name = "coach_trainingPlan",
            joinColumns = @JoinColumn(name = "coach_id"),
            inverseJoinColumns = @JoinColumn(name = "trainingPlan_id"))
    @JsonIgnore
    private List<TrainingPlan> trainingPlan;

    public Coach(String firstName, String lastName, int age, Sex sex, String email, String phone, String login, String password, String photo, Role role, SportCategory sportCategory, Set<Client> clientsSet, Set<SportClub> sportClubSet, List<TrainingPlan> trainingPlan) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
        this.login = login;
        this.password = password;
        this.photo = photo;
        this.role = role;
        this.sportCategory = sportCategory;
        this.clientsSet = clientsSet;
        this.sportClubSet = sportClubSet;
        this.trainingPlan = trainingPlan;
    }

    public Coach() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public SportCategory getSportCategory() {
        return sportCategory;
    }

    public void setSportCategory(SportCategory sportCategory) {
        this.sportCategory = sportCategory;
    }

    public Set<Client> getClientsSet() {
        return clientsSet;
    }

    public void setClientsSet(Set<Client> clientsSet) {
        this.clientsSet = clientsSet;
    }

    public Set<SportClub> getSportClubSet() {
        return sportClubSet;
    }

    public void setSportClubSet(Set<SportClub> sportClubSet) {
        this.sportClubSet = sportClubSet;
    }

    public List<TrainingPlan> getTrainingPlan() {
        return trainingPlan;
    }

    public void setTrainingPlan(List<TrainingPlan> trainingPlan) {
        this.trainingPlan = trainingPlan;
    }
}
