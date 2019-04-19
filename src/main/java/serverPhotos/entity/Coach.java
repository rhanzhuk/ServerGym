package serverPhotos.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import serverPhotos.entity.enums.Role;
import serverPhotos.entity.enums.Sex;
import serverPhotos.entity.enums.SportCategory;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

//TODO Create RelationShip with TrainingPlan

@Entity
@Table(name = "coach")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
    private Set<Client> clientsSet;


    @ManyToMany(mappedBy = "coachSet")
    private Set<SportClub> sportClubSet;


}
