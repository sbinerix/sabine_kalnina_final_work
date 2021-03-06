package lu.lv.sabine_kalnina_final_work.repository;



import lu.lv.sabine_kalnina_final_work.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductRepository implements Repository<Product> {

    private Long idCounter = 0L;
    private final Map<Long, Product> repository;

    public ProductRepository(Map<Long, Product> repository) {
        this.repository = repository;
    }

    @Override
    public Long save(Product product) {
        idCounter++;
        product.setId(idCounter);
        repository.put(idCounter, product);
        return idCounter;
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(repository.values());
    }

    @Override
    public Product findById(Long id) {
        return repository.get(id);
    }

    @Override
    public void delete(Long id) {
        repository.remove(id);
    }
}
