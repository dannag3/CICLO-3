package ciclo3.aplicacionC3.Repositorio;

import ciclo3.aplicacionC3.Interface.CategoryInterface;
import ciclo3.aplicacionC3.Modelo.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class CategoryRepositorio {
    @Autowired
    private CategoryInterface categoryCrudRepository;
    
    public List<Category> getAll(){
        return (List<Category>) categoryCrudRepository.findAll();
    }
    
    public Optional<Category> getCategory(int id){
        return categoryCrudRepository.findById(id);
    }

    public Category save(Category category){
        return categoryCrudRepository.save(category);
    }
    
    public void delete (Category category){
        categoryCrudRepository.delete(category);
    }
    
}

