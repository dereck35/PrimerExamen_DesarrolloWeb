package cinelitas.demo.service;
import cinelitas.demo.ententy.Pelicula;
import cinelitas.demo.repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author derec
 */
@Service
public class PeliculaService implements IPeliculaService {

     @Autowired
    private PeliculaRepository peliculaRepository; 

     @Override
    public List<Pelicula> listMovie() {
        return (List<Pelicula>)peliculaRepository.findAll();
    }

}
