package src.com.adammendak.ProductRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import src.com.adammendak.ProductRepository.config.SecurityUtility;
import src.com.adammendak.ProductRepository.model.User;
import src.com.adammendak.ProductRepository.model.security.Role;
import src.com.adammendak.ProductRepository.model.security.UserRole;
import src.com.adammendak.ProductRepository.service.UserService;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ProductRepositoryApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(ProductRepositoryApplication.class);
    private UserService userService;

    public ProductRepositoryApplication(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {

        SpringApplication.run(ProductRepositoryApplication.class,args);

    }

    @Override
    public void run(String... strings) throws Exception {
        User user1 = new User();
        user1.setFirstName("Adam");
        user1.setLastName("Mendak");
        user1.setUsername("adammendak");
        user1.setPassword(SecurityUtility.passwordEncoder().encode("password"));
        user1.setEmail("email@wp.pl");
        Set<UserRole> userRoleSet = new HashSet<>();
        Role role1 = new Role();
        role1.setRoleId(1);
        role1.setName("ROLE_USER");
        userRoleSet.add(new UserRole(user1,role1));

        userService.createUser(user1, userRoleSet);

        userRoleSet.clear();

        User user2 = new User();
        user2.setFirstName("Admin");
        user2.setLastName("Admin");
        user2.setUsername("admin");
        user2.setPassword(SecurityUtility.passwordEncoder().encode("password"));
        user2.setEmail("email@email.com");
        Set<UserRole> userRoleSet2 = new HashSet<>();
        Role role2 = new Role();
        role2.setRoleId(0);
        role2.setName("ROLE_ADMIN");
        userRoleSet2.add(new UserRole(user2,role2));

        userService.createUser(user2, userRoleSet2);

        userRoleSet2.clear();
    }

}
