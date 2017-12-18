package src.com.adammendak.ProductRepository.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import src.com.adammendak.ProductRepository.model.User;
import src.com.adammendak.ProductRepository.model.security.UserRole;
import src.com.adammendak.ProductRepository.repository.RoleRepository;
import src.com.adammendak.ProductRepository.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.Set;

@Service
public class UserServiceImpl implements  UserService{

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private UserRepository userRepository;
    private  RoleRepository roleRepository;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Transactional
    public User createUser(User user, Set<UserRole> userRoles) {
        User userToBeCreated = userRepository.findByUsername(user.getUsername());

        if(userToBeCreated != null) {
            logger.info("User with name {} already exists", user.getUsername());
        } else {
           userRoles.forEach(userRole -> {
               roleRepository.save(userRole.getRole());
           });
           user.getUserRoles().addAll(userRoles);

           userToBeCreated = userRepository.save(user);
        }

        return userToBeCreated;
    }
}
