import javax.smartcardio.Card;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    //    Scanner scanner = new Scanner(System.in);
    // categoryList, 프로그램 시작 메서드
    // 속성
    private List<Category> categoryList;
    private Scanner scanner;
    private Category selectedCategory;
    private Product selectedProduct;

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
            int inputCategory = scanner.nextInt();

            // 3. 카테고리 선택
            // 예외처리 먼저 하기 (0(종료),1(카테고리 선택),2(카테고리 선택), 3(다시 입력))
            if (inputCategory == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            } else if (0 < inputCategory && inputCategory < categoryList.size()) {
                selectedCategory = categoryList.get(inputCategory - 1);
            } else {
                System.out.println("올바른 숫자를 입력해주세요");
                continue;
            }

            // 4. 상품목록 출력
            List<Product> productList = selectedCategory.getProductList();
            int productCount = 1;
            for (Product product : productList) {
                System.out.println(String.format("%d. %s | %,d | %s",
                        productCount, product.getProductName(), product.getProductPrice(), product.getProductExplain()));
            }

            // 5. 입력값 받기
            System.out.println("0. 뒤로가기");
            System.out.print("입력 : ");
            int inputProduct = scanner.nextInt();

            // 6. 상품 선택
            if (inputProduct == 0) {
                continue;
            } else if (inputProduct >= 0 && productList.size() >= inputProduct) {
                selectedProduct = productList.get(inputProduct - 1);
                System.out.println(String.format("선택한 상품 : %s | %,d | %s | 재고 : %,d개",
                        selectedProduct.getProductName(), selectedProduct.getProductPrice(),
                        selectedProduct.getProductExplain(), selectedProduct.getProductQuantity()));
            }
        }
    }
}
// 분리를 어떤 기준으로 분리할 수 있을까 계획하기!