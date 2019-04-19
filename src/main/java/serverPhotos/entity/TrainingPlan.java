package serverPhotos.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "training_plan")
public class TrainingPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private LocalDate startDay;

    @Column(name = "lenght")
    private int lenght;

    @OneToMany(mappedBy = "trainingPlan", cascade = CascadeType.ALL)
    private List<Training> trainingList;

    public TrainingPlan(String name, LocalDate startDay, int lenght, List<Training> trainingList) {
        this.name = name;
        this.startDay = startDay;
        this.lenght = lenght;
        this.trainingList = trainingList;
    }

    public TrainingPlan() {
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

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public List<Training> getTrainingList() {
        return trainingList;
    }

    public void setTrainingList(List<Training> trainingList) {
        this.trainingList = trainingList;
    }
}
