package src.com.adammendak.ProductRepository.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import src.com.adammendak.ProductRepository.model.User;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername (String username);
    User findByEmail (String email);
    List<User> findAll();
}
