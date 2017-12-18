package src.com.adammendak.ProductRepository.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shopping_cart")
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
