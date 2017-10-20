package src.com.adammendak.ProductRepository.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    private List<Product> products;
    private Consumer consumer;


}
