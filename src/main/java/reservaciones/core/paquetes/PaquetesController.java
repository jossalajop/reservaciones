package reservaciones.core.paquetes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/paquetes")
@CrossOrigin({"*"})

public class PaquetesController 
{
   //Consumir el servicio
   @Autowired
   private PaquetesService service;

    @GetMapping("/{id}/")
    public Paquetes findById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/")
    public List<Paquetes> findAll(){
        return service.findAll();
    }

    @PostMapping("/")
    public Paquetes save( @RequestBody Paquetes entity ){
        return service.save(entity);
    }

    @PutMapping("/")
    public Paquetes update ( @RequestBody Paquetes entity ){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }
}