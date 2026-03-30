import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    //    Scanner scanner = new Scanner(System.in);
    // categoryList, 프로그램 시작 메서드
    // 속성
    private List<Category> categoryList;
    private Scanner scanner;

    // 생성자
    public CommerceSystem(List<Category> categoryList, Scanner scanner) {
        this.categoryList = categoryList;
        this.scanner = scanner;
    }

    // 기능
    // 프로그램 시작 기능
    public void start() {
        while (true) {

            // 1. 카테고리 목록 출력
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            int categoryCount = 1;
            for (Category category : categoryList) {
                System.out.println(categoryCount + ". " + category.getCategoryName());
                categoryCount++;
            }

            // 2. 입력값 받기
            System.out.println("0. 종료      | 프로그램 종료");
            System.out.print("입력 : ");
            int categoryNumber = scanner.nextInt();

            // 3. 카테고리 선택
            if (categoryNumber == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            } else if (categoryNumber >= 0 && categoryList.size() >= categoryNumber) {
                Category selectCategory = categoryList.get(categoryNumber - 1);
                List<Product> productList = selectCategory.getProductList();

                // 4. 상품 목록 출력
                System.out.println("[ " + selectCategory.getCategoryName() + " 카테고리 ]");
                int productCount = 1;
                for (Product product : productList) {
                    System.out.println(String.format("%d. %s | %,d원 | %s",
                            productCount, product.getProductName(), product.getProductPrice(), product.getProductExplain()));
                    productCount++;
                }

                // 5. 입력값 받기
                System.out.println("0. 뒤로가기");
                System.out.print("입력 : ");
                int productNumber = scanner.nextInt();

                // 6. 상품 선택
                if (productNumber == 0) {
                    continue;
                } else if (productNumber >= 0 && productList.size() >= productNumber) {
                    Product product = productList.get(productNumber - 1);
                    System.out.println(String.format("선택한 상품 : %s | %,d원 | %s | 재고 : %,d개",
                            product.getProductName(), product.getProductPrice(),
                            product.getProductExplain(), product.getProductQuantity()));
                }
            } else {
                System.out.println("올바른 번호를 입력해주세요");
                continue;
            }
        }

    }
}