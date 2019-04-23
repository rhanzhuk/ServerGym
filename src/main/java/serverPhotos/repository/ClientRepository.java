package serverPhotos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import serverPhotos.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long>{
    @Query(value = "SELECT * FROM client where first_name = ?1",nativeQuery = true)
    Client findByFirstName(String firstName);
}
