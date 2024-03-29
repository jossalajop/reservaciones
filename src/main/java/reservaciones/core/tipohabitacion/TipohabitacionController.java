package reservaciones.core.tipohabitacion;

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
@RequestMapping("/app/tipohabitacion")
@CrossOrigin({"*"})

public class TipohabitacionController 
{
   //Consumir el servicio
   @Autowired
   private TipohabitacionService service;

    @GetMapping("/{id}/")
    public Tipohabitacion findById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/")
    public List<Tipohabitacion> findAll(){
        return service.findAll();
    }

    @PostMapping("/")
    public Tipohabitacion save( @RequestBody Tipohabitacion entity ){
        return service.save(entity);
    }

    @PutMapping("/")
    public Tipohabitacion update ( @RequestBody Tipohabitacion entity ){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }
}
