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

    public ProductCategory() {
    }

    public Integer getProductListId() {
        return productCategoryId;
    }

    public void setProductListId(Integer productListId) {
        this.productCategoryId = productListId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
