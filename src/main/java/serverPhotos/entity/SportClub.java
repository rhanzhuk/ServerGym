package serverPhotos.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "sport_club")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SportClub {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "description")
    private String description;

    @ManyToMany
    @JoinTable(
            name = "coach_sportClub",
            joinColumns = @JoinColumn(name = "sportClub_id"),
            inverseJoinColumns = @JoinColumn(name = "coach_id"))
    private Set<Coach> coachSet;

    public SportClub(String name, String location, String description, Set<Coach> coachSet) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.coachSet = coachSet;
    }

    public SportClub() {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Coach> getCoachSet() {
        return coachSet;
    }

    public void setCoachSet(Set<Coach> coachSet) {
        this.coachSet = coachSet;
    }
}
