package san.edu.lab4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import san.edu.lab4.domain.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
