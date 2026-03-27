import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Product galaxy = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 0);
        Product iphone = new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 10);
        Product macbook = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 20);
        Product airpods = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 100);

        List<Product> productList = new ArrayList<>();

        productList.add(galaxy);
        productList.add(iphone);
        productList.add(macbook);
        productList.add(airpods);

        //            - [ ]  반복문을 활용해 `products`를 탐색하면서 하나씩 접근합니다.

        while (true) {

            int count = 1;
            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
            for (Product product : productList) {
                System.out.println(count + ". " + product.getName() + "   |     " + product.getPrice() + "원" + "    |    " + product.getExplain() + "  |" + product.getCount());
                count ++;
            }

            System.out.println("0. 종료            | 프로그램 종료");

            System.out.print("입력 : ");

            int exit = scanner.nextInt();
            if (exit == 0) {
                System.out.println("------------------");
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            }
        }
//        System.out.print("입력 : ");
//
//        int exit = scanner.nextInt();
//        if (exit == 0) {
//            System.out.println("------------------");
//            System.out.println("커머스 플랫폼을 종료합니다.");
//        }

    }
}
