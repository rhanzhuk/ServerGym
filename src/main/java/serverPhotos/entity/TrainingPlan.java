package serverPhotos.entity;

import javax.persistence.*;
import java.time.LocalDate;

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

}
