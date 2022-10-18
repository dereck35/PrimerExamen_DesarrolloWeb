package cinelitas.demo.repository;
import cinelitas.demo.ententy.Sala;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author derec
 */
@Repository
public interface SalaRepository extends CrudRepository<Sala,Long>{

    
}
