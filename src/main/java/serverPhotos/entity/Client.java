package serverPhotos.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import serverPhotos.entity.enums.Levels;
import serverPhotos.entity.enums.Role;
import serverPhotos.entity.enums.Sex;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

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
}
