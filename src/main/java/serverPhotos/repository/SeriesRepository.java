package serverPhotos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import serverPhotos.entity.Series;

@Repository
public interface SeriesRepository extends JpaRepository<Series, Long> {
}
