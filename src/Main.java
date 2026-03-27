import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        // 객체화 (인스턴스화)
        Product galaxy = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 0);
        Product iphone = new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 10);
        Product macbook = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 100);
        Product airpods = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 40);

        productList.add(galaxy);
        productList.add(iphone);
        productList.add(macbook);
        productList.add(airpods);

        CommerceSystem commerceSystem = new CommerceSystem(productList, scanner);
        commerceSystem.start();
    }

}
