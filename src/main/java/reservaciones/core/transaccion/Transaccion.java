package reservaciones.core.transaccion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import reservaciones.core.gastos.Gastos;
import reservaciones.core.metodopago.Metodopago;
import reservaciones.core.paquetehabitacion.Paquetehabitacion;
import reservaciones.core.reservahabitacion.Reservahabitacion;



@Data
@Entity
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private double costototal;
    private String infopago;

   @ManyToOne
    private Metodopago metodopago;
    @ManyToOne
    private Gastos gastos;
    @ManyToOne
    private Reservahabitacion reservahabitacion;
    @ManyToOne
    private Paquetehabitacion paquetehabitacion;
    }
    
   