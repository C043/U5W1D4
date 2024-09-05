package U5W1D4.repositories;

import U5W1D4.entities.Cibo;
import U5W1D4.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiboRepository extends JpaRepository<Cibo, Long> {
    Topping findByNome(String nome);

    boolean existsByNome(String nome);
}
