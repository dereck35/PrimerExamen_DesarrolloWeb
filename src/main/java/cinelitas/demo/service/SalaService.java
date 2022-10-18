package cinelitas.demo.service;

import cinelitas.demo.ententy.Sala;
import cinelitas.demo.repository.SalaRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author derec
 */
@Service
public class SalaService implements ISalaService{
    
    @Autowired
    SalaRepository salaRepository;

    @Override
    public List<Sala> getAllSala() {
        return (List<Sala>) salaRepository.findAll();
    }

    @Override
    public Sala getSalaById(long id) {
       return salaRepository.findById(id).orElse(null);
    }

    @Override
    public void saveSala(Sala sala) {
       salaRepository.save(sala);
    }

    @Override
    public void delete(long id) {
       salaRepository.deleteById(id);
    }

}
