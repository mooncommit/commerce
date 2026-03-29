public class Product {
//    상품명, 가격, 설명, 재고수량 필드

    private String name;
    private int price;
    private String explain;
    private int pics;

    public Product (String name, int price, String explain, int pics) {
        this.name = name;
        this.price = price;
        this.explain = explain;
        this.pics = pics;
    }

    public String  getName() {
        return name;
    }

    public int getPrice() {
        return  price;
    }
    public String getExplain() {
        return explain;
    }

    public int getPics() {
        return pics;
    }


}