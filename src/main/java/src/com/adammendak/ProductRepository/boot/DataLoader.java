package src.com.adammendak.ProductRepository.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import src.com.adammendak.ProductRepository.model.Product;
import src.com.adammendak.ProductRepository.model.User;
import src.com.adammendak.ProductRepository.repository.ProductRepository;
import src.com.adammendak.ProductRepository.repository.UserRepository;

@Component
public class DataLoader implements CommandLineRunner{

    private ProductRepository productRepository;
    private UserRepository userRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

//        Product product1 = new Product();
//        product1.setName("Snickers");
//        product1.setDescription("chocolate bar");
//        product1.setCategory("BARS");
//        product1.setPrice(10.0);
//
//        productRepository.save(product1);
//
//        Product product2 = new Product();
//        product2.setName("Milkyway");
//        product2.setDescription("self explanatory");
//        product2.setCategory("BARS");
//        product2.setPrice(7.5);
//
//        productRepository.save(product2);
//
//        User user1 = new User();
//        user1.setFirstName("Adam");
//        user1.setLastName("Mendak");
//        user1.setAddress("Warszawa");
//        user1.setEmail("adam@mendak.pl");
//
//        userRepository.save(user1);

    }
}
