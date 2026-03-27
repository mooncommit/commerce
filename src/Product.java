public class Product {
//    상품명, 가격, 설명, 재고수량
    // 속성 (필드)
    private String name;
    private int price;
    private String explain;
    private int quantity;

    // 생성자
    public Product (String name, int price, String explain, int quantity) {
        this.name = name;
        this.price = price;
        this.explain = explain;
        this.quantity = quantity;
    }

    // 기능
    // 이 객체의 name 필드의 저장된 값을 반환해주는 메서드
    public String  getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getExplain() {
        return explain;
    }

    public int getQuantity() {
        return quantity;
    }


}
