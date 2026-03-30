public class Product {
    // 상품명, 가격, 설명, 재고수량
    // 속성
    private String productName;
    private int productPrice;
    private String productExplain;
    private int productQuantity;

    // 생성자
    public Product(String productName, int productPrice, String productExplain, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productExplain = productExplain;
        this.productQuantity = productQuantity;
    }

    // 기능

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public String getProductExplain() {
        return productExplain;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}