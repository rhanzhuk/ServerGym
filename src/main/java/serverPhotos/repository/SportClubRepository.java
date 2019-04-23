package serverPhotos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import serverPhotos.entity.SportClub;

@Repository
public interface SportClubRepository extends JpaRepository<SportClub, Long> {

    @Query(value = "SELECT * FROM sport_club WHERE name = ?1", nativeQuery = true)
    SportClub findByName(String name);

}
