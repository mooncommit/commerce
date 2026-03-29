import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    Scanner scanner = new Scanner(System.in);

    // 속성
    // 리스트
    private List<Product> productList;

    // 생성자
    public CommerceSystem (List<Product> productList) {
        this.productList = productList;
    }

    // 기능
    public void start () {
        while (true) {
            int count = 1;
            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
            for (Product product : productList) {
                System.out.println(String.format("%d. %s | %,d원 | %s", count, product.getName(), product.getPrice(), product.getExplain()));
                count ++;
            }
            System.out.println("0. 종료        | 프로그램 종료");
            System.out.print("입력 : ");
            int exit = scanner.nextInt();
            if (exit == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            }

        }
    }
}