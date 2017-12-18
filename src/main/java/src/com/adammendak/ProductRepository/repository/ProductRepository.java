package src.com.adammendak.ProductRepository.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import src.com.adammendak.ProductRepository.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
