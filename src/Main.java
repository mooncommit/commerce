import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Product 전자제품 객체 만들기
        Product galaxy = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 0);
        Product iphone = new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 10);
        Product macbook = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 20);
        Product airpods = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 100);

        // 전자제품 리스트
        // List.of 사용 : 괄호 안의 값들로 리스트 만들기
        List<Product> productList = new ArrayList<>(List.of(galaxy, iphone, macbook, airpods));

        // 프로그램 시작
        CommerceSystem commerceSystem = new CommerceSystem(productList);
        commerceSystem.start();


    }

}