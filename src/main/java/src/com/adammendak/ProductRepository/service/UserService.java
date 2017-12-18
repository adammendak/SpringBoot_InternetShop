package src.com.adammendak.ProductRepository.service;

import src.com.adammendak.ProductRepository.model.User;
import src.com.adammendak.ProductRepository.model.security.UserRole;

import java.util.Set;

public interface UserService {

    User createUser (User user, Set<UserRole> userRoles);

}
