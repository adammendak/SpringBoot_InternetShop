package src.com.adammendak.ProductRepository.model;


import javax.persistence.*;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    private String customerId;
//    private String productId;
//
//    public Order(String customerId, String productId) {
//        this.customerId = customerId;
//        this.productId = productId;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order() {
    }

    //    public String getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(String customerId) {
//        this.customerId = customerId;
//    }
//
//    public String getProductId() {
//        return productId;
//    }
//
//    public void setProductId(String productId) {
//        this.productId = productId;
//    }
}
