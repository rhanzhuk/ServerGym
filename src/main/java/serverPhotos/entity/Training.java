package serverPhotos.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

//TODO DONE

@Entity
@Table(name = "training")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Training {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "icon")
    private String icon;

    @Column(name = "comment_desc")
    private String comment;

    @Column(name = "training_date")
    private LocalDate trainingDate;

    @Column(name = "check")
    private boolean checkToDone;

    @OneToMany(mappedBy = "training", cascade = CascadeType.ALL)
    private List<Exercise> exerciseList;

    @ManyToOne
    @JoinColumn(name = "plan_id")
    private TrainingPlan trainingPlan;

    public Training(String name, String icon, String comment, LocalDate trainingDate, boolean checkToDone, List<Exercise> exerciseList, TrainingPlan trainingPlan) {
        this.name = name;
        this.icon = icon;
        this.comment = comment;
        this.trainingDate = trainingDate;
        this.checkToDone = checkToDone;
        this.exerciseList = exerciseList;
        this.trainingPlan = trainingPlan;
    }

    public Training() {
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(LocalDate trainingDate) {
        this.trainingDate = trainingDate;
    }

    public boolean isCheckToDone() {
        return checkToDone;
    }

    public void setCheckToDone(boolean checkToDone) {
        this.checkToDone = checkToDone;
    }

    public List<Exercise> getExerciseList() {
        return exerciseList;
    }

    public void setExerciseList(List<Exercise> exerciseList) {
        this.exerciseList = exerciseList;
    }

    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }

    public void setTrainingPlan(TrainingPlan trainingPlan) {
        this.trainingPlan = trainingPlan;
    }
}
