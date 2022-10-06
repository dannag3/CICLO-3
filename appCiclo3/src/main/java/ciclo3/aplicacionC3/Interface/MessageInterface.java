package ciclo3.aplicacionC3.Interface;

import ciclo3.aplicacionC3.Modelo.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageInterface extends CrudRepository <Message, Integer> {
    
}
