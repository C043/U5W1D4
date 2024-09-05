package U5W1D4.services;

import U5W1D4.entities.Cibo;
import U5W1D4.exceptions.ValidationException;
import U5W1D4.repositories.CiboRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CiboService {
    @Autowired
    private CiboRepository ciboRepository;

    public void saveFood(Cibo newFood){
        if(ciboRepository.existsByNome(newFood.getNome())) throw new ValidationException("Cibo già presente");
        ciboRepository.save(newFood);
        log.info("Cibo inserito con successo!");
    }
}
