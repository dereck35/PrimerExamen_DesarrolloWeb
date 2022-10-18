package cinelitas.demo.service;
import cinelitas.demo.ententy.Sala;
import java.util.List;

/**
 *
 * @author derec
 */
public interface ISalaService {
    
    public List<Sala> getAllSala();
    public Sala getSalaById(long id);
    public void saveSala(Sala Sala);
    public void delete(long id);

}
