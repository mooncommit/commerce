import java.util.List;

public class Category {
    // productList, 카테고리 이믈
    // 속성
    private String categoryName;
    private List<Product> productList;

    // 생성자
    public Category (String categoryName, List<Product> productList) {
        this.categoryName = categoryName;
        this.productList = productList;
    }

    // 기능

    public String getCategoryName() {
        return categoryName;
    }

    public List<Product> getProductList() {
        return productList;
    }
}