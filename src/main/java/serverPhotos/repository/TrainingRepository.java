package serverPhotos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import serverPhotos.entity.Training;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Long> {
}
