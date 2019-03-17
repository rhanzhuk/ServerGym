package serverPhotos.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "series")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Series {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "weight")
    private double weight;
    @Column(name = "count")
    private int count;
    @Column(name = "repeats")
    private int repeats;

    @OneToOne(optional = false, mappedBy="series")
    private Exercise exercise;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id", nullable = false,  insertable = false, updatable = false)
    private Training training;

    public Series(double weight, int count, int repeats, Exercise exercise, Training training) {
        this.weight = weight;
        this.count = count;
        this.repeats = repeats;
        this.exercise = exercise;
        this.training = training;
    }

    public Series() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
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

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

    @Override
    public String toString() {
        return "Series{" +
                "id=" + id +
                ", weight=" + weight +
                ", count=" + count +
                ", repeats=" + repeats +
                ", exercise=" + exercise +
                ", training=" + training +
                '}';
    }
}
