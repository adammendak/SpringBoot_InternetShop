package src.com.adammendak.ProductRepository.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductList {

    @Id
    private Integer productListId;
    private String category;

    public ProductList() {
    }

    public Integer getProductListId() {
        return productListId;
    }

    public void setProductListId(Integer productListId) {
        this.productListId = productListId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
