package U5W1D4.repositories;

import U5W1D4.entities.Cibo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiboRepository extends JpaRepository<Cibo, Long> {
    boolean existsByNome(String nome);
}
