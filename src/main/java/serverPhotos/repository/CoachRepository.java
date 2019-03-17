package serverPhotos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import serverPhotos.entity.Coach;

@Repository
public interface CoachRepository extends JpaRepository<Coach, Long> {
}
