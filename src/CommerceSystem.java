import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
//    Product를 관리하는 리스트가 필드로 존재
    // 리스트 필요
    Scanner scanner = new Scanner(System.in);

    // 속성
    private List<Product> electronicsList;

    // 생성자
    public CommerceSystem(List<Product> electronicsList) {
        this.electronicsList = electronicsList;
    }

    // 기능
    public void start() {
        while (true) {
            int count = 1;
            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
            for (Product product : electronicsList) {
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