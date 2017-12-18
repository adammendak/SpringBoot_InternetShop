package src.com.adammendak.ProductRepository.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long productCategoryId;
    private String category;
//    private List<Product> procuctList;

//
//    public ProductCategory(Long productCategoryId, String category) {
//        this.productCategoryId = productCategoryId;
//        this.category = category;
//    }

    public ProductCategory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public ProductCategory(String category) {
//        this.category = category;
//    }
//
//    public Long getProductCategoryId() {
//        return productCategoryId;
//    }
//
//    public void setProductCategoryId(Long productCategoryId) {
//        this.productCategoryId = productCategoryId;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
}
