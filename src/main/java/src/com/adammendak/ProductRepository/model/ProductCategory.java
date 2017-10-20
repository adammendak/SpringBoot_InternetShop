package src.com.adammendak.ProductRepository.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class ProductCategory {

    @Id
    private Integer productCategoryId;
    private String category;
//    private List<Product> procuctList;


    public ProductCategory(Integer productCategoryId, String category) {
        this.productCategoryId = productCategoryId;
        this.category = category;
    }

    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
