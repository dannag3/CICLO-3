package ciclo3.aplicacionC3.Repositorio;

import ciclo3.aplicacionC3.Interface.OrtopedicInterface;
import ciclo3.aplicacionC3.Modelo.Ortopedic;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository

public class OrtopedicRepositorio {
    @Autowired
    private OrtopedicInterface ortopedicCrudRepository;
    
      public List<Ortopedic> getAll(){
        return (List<Ortopedic>) ortopedicCrudRepository.findAll();
    }
    
    public Optional<Ortopedic> getOrtopedic(int id){
        return ortopedicCrudRepository.findById(id);
    }

    public Ortopedic save(Ortopedic ortopedic){
        return ortopedicCrudRepository.save(ortopedic);
    }
    
     public void delete (Ortopedic ortopedic){
        ortopedicCrudRepository.delete(ortopedic);
    }
    
}

