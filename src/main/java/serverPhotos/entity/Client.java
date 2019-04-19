package serverPhotos.entity;

import serverPhotos.entity.enums.Levels;
import serverPhotos.entity.enums.Role;
import serverPhotos.entity.enums.Sex;

import javax.persistence.*;
import java.util.Set;

//TODO RelationShip with TrainingPlan

@Entity
@Table (name = "client")
public class Client {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column(name = "id")
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
    private long phone;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "photo")
    private String photo;

    @Column(name = "level")
    private Levels level;

    @Column (name = "role")
    private Role role;

    @ManyToMany(mappedBy = "clientsSet")
    private Set<Coach> coachSet;


    public Client(String firstName, String lastName, int age, Sex sex,  String email, long phone, String login, String password, String photo, Levels level, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
        this.login = login;
        this.password = password;
        this.photo = photo;
        this.level = level;
        this.role = role;
    }

    public Client() {
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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
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

    public Levels getLevel() {
        return level;
    }

    public void setLevel(Levels level) {
        this.level = level;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<Coach> getCoachSet() {
        return coachSet;
    }

    public void setCoachSet(Set<Coach> coachSet) {
        this.coachSet = coachSet;
    }
}
