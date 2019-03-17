package serverPhotos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import serverPhotos.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long>{
}
