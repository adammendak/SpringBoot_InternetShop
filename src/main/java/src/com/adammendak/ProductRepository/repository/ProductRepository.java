package src.com.adammendak.ProductRepository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import src.com.adammendak.ProductRepository.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
