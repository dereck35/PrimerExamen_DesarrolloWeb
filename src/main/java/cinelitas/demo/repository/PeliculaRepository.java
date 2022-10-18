package cinelitas.demo.repository;
import cinelitas.demo.ententy.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author derec
 */
@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula,Long>{
    
}
