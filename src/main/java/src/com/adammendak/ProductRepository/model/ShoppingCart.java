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
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
//    private List<Product> products;
//    private Consumer consumer;


    public ShoppingCart() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
