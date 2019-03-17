package serverPhotos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import serverPhotos.entity.SportClub;

@Repository
public interface SportClubRepository extends JpaRepository<SportClub, Long> {
}
