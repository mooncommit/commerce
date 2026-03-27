import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 객체화 (인스턴스화)
        Product galaxy = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 0);
        Product iphone = new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 10);
        Product macbook = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 100);
        Product airpods = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 40);

        // 리스트 만들기
        List<Product> productList = new ArrayList<>();
        productList.add(galaxy);
        productList.add(iphone);
        productList.add(macbook);
        productList.add(airpods);


        // 반복문으로 ProductList 출력
        while (true) {
            int number = 0;
            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ] ");
            for (Product products : productList) {
                number++;
                System.out.println(number + ". " + products.getName() + "  |  " + products.getPrice() + "  |  " + products.getExplain());
            }
            System.out.println("0. 종료          | 프로그램 종료");
            System.out.println("--------------------------------");
            System.out.print("입력 : ");
            int exit = scanner.nextInt();
            if (exit == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");

                break;
            }

        }





    }

}
