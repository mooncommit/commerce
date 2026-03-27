public class Product {

    // 속성
    private String name;
    private int price;
    private String explain;
    private int count;

    // 생성자

    public Product(String name, int price, String explain, int count) {
        this.name = name;
        this.price = price;
        this.explain = explain;
        this.count = count;
    }

    // 기능
    public String  getName() {
        return name;

    }
    public int getPrice() {
        return price;
    }

    public String getExplain() {
        return explain;
    }

    public int getCount() {
        return count;
    }

}
