package serverPhotos.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Entity
@Table(name = "exercise")
public class Exercise {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "icon")
    private String icon;

    @Column(name = "weight")
    private int weight;

    @Column(name = "count")
    private int count;

    @Column(name = "repeats")
    private int repeats;

    @Column(name = "youTube")
    private String youtubeLink;

    @ManyToOne
    @JoinColumn(name = "training_id")
    private Training training;

    public Exercise(String name, String description, String icon, int weight, int count, int repeats, String youtubeLink, Training training) {
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.weight = weight;
        this.count = count;
        this.repeats = repeats;
        this.youtubeLink = youtubeLink;
        this.training = training;
    }

    public Exercise() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getRepeats() {
        return repeats;
    }

    public void setRepeats(int repeats) {
        this.repeats = repeats;
    }

    public String getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }
}
