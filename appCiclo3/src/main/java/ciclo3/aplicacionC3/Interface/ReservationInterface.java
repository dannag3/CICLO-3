package ciclo3.aplicacionC3.Interface;

import ciclo3.aplicacionC3.Modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationInterface extends CrudRepository <Reservation, Integer> {
    
}
