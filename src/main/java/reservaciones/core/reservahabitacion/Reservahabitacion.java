package reservaciones.core.reservahabitacion;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import reservaciones.core.habitaciones.Habitaciones;

    
@Data
@Entity
public class Reservahabitacion {
        //Atributos de la clase Usuario
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private Integer numerohabitacion;
    private LocalDate fechaentrada;
    private LocalDate fechasalida;
    private boolean estado;

<<<<<<< HEAD
=======

>>>>>>> af2ec4a366b0b3b2c43fdfdd95b50b995bccdaa7
    @ManyToOne
    private Habitaciones habitaciones;
    }
    