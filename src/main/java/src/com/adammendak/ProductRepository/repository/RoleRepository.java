package src.com.adammendak.ProductRepository.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import src.com.adammendak.ProductRepository.model.security.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{
}
