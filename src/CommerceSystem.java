import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    Scanner scanner = new Scanner(System.in);
    // categoryList, 프로그램 시작 메서드
    // 속성
    private List<Category> categoryList;

    // 생성자
    public CommerceSystem(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    // 기능
    // 프로그램 시작 기능
    public void start() {
        while (true) {

            // 메인
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            int categoryCount = 1;
            for (Category category : categoryList) {
                System.out.println(categoryCount + ". " + category.getCategoryName());
                categoryCount++;
            }
            // 카테고리 선택
            System.out.println("0. 종료      | 프로그램 종료");
            System.out.print("입력 : ");
            int categoryNumber = scanner.nextInt();

            // 0이면 프로그램 종료
            if (categoryNumber == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            // 아니면
            } else {
                // 변수가 갖는 데이터 타입 Category
                // selectCategory : 변수명
                // categoryList.get(categoryNumber -1); : categoryNumber에 -1, 값에 따른 리스트를 selectCategory 변수에 값을 할당
                Category selectCategory = categoryList.get(categoryNumber -1);

                // List<Product>: 변수가 갖는 데이터 타입
                // productList : 변수명
                // selectCategory.getProductList(); 위에 꺼낸 객체를 productList에 넣어준다
                List<Product> productList = selectCategory.getProductList();

                // 전자제품 카테고리 List 출력
                System.out.println("[ " + selectCategory.getCategoryName() + "전자제품 카테고리 ]");
                int productCount = 1;
                for (Product product : productList) {
                    System.out.println(String.format("%d. %s | %,d | %s",
                            productCount, product.getProductName(), product.getProductPrice(), product.getProductExplain()));
                    productCount++;
                }

                System.out.println("0. 뒤로가기");
                System.out.print("입력 : ");
                int productNumber = scanner.nextInt();
                if (productNumber == 0) {
//                    continue; 여기 튜터님께 물어보기!!
                } else {
                    Product product = productList.get(productNumber - 1);

                    System.out.println(String.format("선택한 상품 : %s | %,d | %s | 재고 : %,d개",
                            product.getProductName(), product.getProductPrice(),
                            product.getProductExplain(), product.getProductQuantity()));
                }
            }
        }
    }
}