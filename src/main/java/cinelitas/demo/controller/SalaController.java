package cinelitas.demo.controller;
import cinelitas.demo.ententy.Pelicula;
import cinelitas.demo.ententy.Sala;
import cinelitas.demo.service.IPeliculaService;
import cinelitas.demo.service.ISalaService;
import cinelitas.demo.service.PeliculaService;
import cinelitas.demo.service.SalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author derec
 */
    @Controller
public class SalaController {
    
    @Autowired
    private ISalaService salaService;
    
     @Autowired
     private IPeliculaService peliculaService;
    
      @GetMapping("/sala")     
  public String index (Model model){
      List<Sala> listaSala = salaService.getAllSala();
      model.addAttribute("titulo", "Tabla Sala");
      model.addAttribute("sala", listaSala);
       return "sala";
}
  @GetMapping("/salaNuevo")
  public String crearSala(Model model){
      List<Pelicula> listaPelicula = peliculaService.listMovie();
      model.addAttribute("sala" , new Sala());
      model.addAttribute("pelicula", listaPelicula);
        return "crear";     
  }  
  
  @PostMapping("/save")
 public String guardarSala(@ModelAttribute Sala sala){
 salaService.saveSala(sala);
 return "redirect:/sala";
 }
 
 @GetMapping("/editSala/{id}")
 public String editarSala(@PathVariable("id") Long idSala, Model model){
 Sala sala = salaService.getSalaById(idSala);
 List<Pelicula> listaPelicula = peliculaService.listMovie();
 model.addAttribute("sala", sala);
 model.addAttribute("pelicula", listaPelicula);
 return "crear";
 }
         
 @GetMapping("/delete/{id}")
 public String eliminarSala(@PathVariable("id") Long idSala){
 salaService.delete(idSala);
 return "redirect:/estado";
 }
}
