import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    // 속성
    private List<Product> productList;
    private Scanner scanner;


    // 생성자
    public CommerceSystem (List<Product> productList, Scanner scanner) {
        this.productList = productList;
        this.scanner = scanner;
    }

    // 기능
    public void start() {
        // 반복문으로 ProductList 출력
        while (true) {
            int number = 0;
            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ] ");
            for (Product products : productList) {
                number++;
//                System.out.println(number + ". " + products.getName() + "  |  " + products.getPrice() + "  |  " + products.getExplain());
                // String.format("형식", 값) 활용
                System.out.println(String.format("%d. %s | %,d원 | %s", number, products.getName(), products.getPrice(), products.getExplain()));
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
