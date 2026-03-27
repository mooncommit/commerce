import java.util.List;

public class Category {
    // 전자제품, 의류, 식품 등 각 카테고리 내에 여러 `Product`를 만들어 줍니다.
    // 이 클래스가 필요한 데이터는 일단 상품 리스트와 그리고 카테고리 이름이 필요하다

    // 속성
    private List<Product> productList;
    private String categoryName;

    // 생성자
    public Category (List<Product> productList, String categoryName) {
        this.productList = productList;
        this.categoryName = categoryName;
    }

    // 기능

    public List<Product> getProductList() {
        return productList;
    }

    // 카테고리 이름 메서드
    public String getName() {
        return categoryName;
    }

}
