import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    Scanner scanner = new Scanner(System.in);
    // categoryList, 프로그램 시작 메서드
    // 속성
    private List<Category> categoryList;

    // 생성자
    public CommerceSystem (List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    // 기능
    public void start() {
        while (true) {
            // 카테고리 고르기(메인)
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            int categoryCount = 1;
            for (Category category : categoryList ) {
                System.out.println(String.format("%d. %s", categoryCount, category.getCategoryName()));
                categoryCount ++;
            }
            // 카테고리 0을 골랐을 때
            System.out.println("0. 종료      | 프로그램 종료");
            System.out.print("입력 : ");
            int categoryNumber = scanner.nextInt();
            if (categoryNumber == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;

                // 1 입력 - 전자제품 카테고리
            } else if (categoryNumber == 1) {
                List<Product> productList = categoryList.get(0).getProductList(); // productList 0번 전자제품 담기 위해 선언
                System.out.println("[ 전자제품 카테고리 ]");
                int productCount = 1;
                for (Product product : productList) {
                    System.out.println(String.format("%d. %s | %,d원 | %s",
                            productCount, product.getProductName(), product.getProductPrice(), product.getProductExplain()));
                    productCount ++;
                }
                System.out.println("0. 뒤로가기");
                System.out.print("입력 : ");
                int productNumber = scanner.nextInt();

                // 전자제품 상품 번호 고르기
                if (productNumber == 1) {
                    System.out.println(String.format("선택한 상품 : %s | %,d원 | %s | 재고 : %d개",
                            productList.get(0).getProductName(), productList.get(0).getProductPrice(), productList.get(0).getProductExplain(),
                            productList.get(0).getProductPice()));
                    break;
                } else if (productNumber == 2) {
                    System.out.println(String.format("선택한 상품 : %s | %,d원 | %s | 재고 : %d개",
                            productList.get(1).getProductName(), productList.get(1).getProductPrice(), productList.get(1).getProductExplain(),
                            productList.get(1).getProductPice()));
                    break;
                } else if (productNumber == 3) {
                    System.out.println(String.format("선택한 상품 : %s | %,d원 | %s | 재고 : %d개",
                            productList.get(2).getProductName(), productList.get(2).getProductPrice(), productList.get(2).getProductExplain(),
                            productList.get(2).getProductPice()));
                    break;
                } else if (productNumber == 4) {
                    System.out.println(String.format("선택한 상품 : %s | %,d원 | %s | 재고 : %d개",
                            productList.get(3).getProductName(), productList.get(3).getProductPrice(), productList.get(3).getProductExplain(),
                            productList.get(3).getProductPice()));
                    break;
                }

                // 카테고리 2번 의류를 골랐을 때
            } else if (categoryNumber == 2) {
                System.out.println("[ 의류 카테고리 ]");
                List<Product> productList = categoryList.get(1).getProductList(); // productList 2번 의류 담기 위해 선언
                int productCount = 1;
                for (Product product : productList) {
                    System.out.println(String.format("%d. %s | %,d원 | %s",
                            productCount, product.getProductName(), product.getProductPrice(), product.getProductExplain()));
                    productCount++;
                }
                System.out.println("0. 뒤로가기");
                System.out.print("입력 : ");
                int clothesProductNumber = scanner.nextInt();

                // 전자제품 상품 번호 고르기
                if (clothesProductNumber == 1) {
                    System.out.println(String.format("선택한 상품 : %s | %,d원 | %s | 재고 : %d개",
                            productList.get(0).getProductName(), productList.get(0).getProductPrice(), productList.get(0).getProductExplain(),
                            productList.get(0).getProductPice()));
                    break;
                } else if (clothesProductNumber == 2) {
                    System.out.println(String.format("선택한 상품 : %s | %,d원 | %s | 재고 : %d개",
                            productList.get(1).getProductName(), productList.get(1).getProductPrice(), productList.get(1).getProductExplain(),
                            productList.get(1).getProductPice()));
                    break;
                } else if (clothesProductNumber == 3) {
                    System.out.println(String.format("선택한 상품 : %s | %,d원 | %s | 재고 : %d개",
                            productList.get(2).getProductName(), productList.get(2).getProductPrice(), productList.get(2).getProductExplain(),
                            productList.get(2).getProductPice()));
                    break;
                } else if (clothesProductNumber == 4) {
                    System.out.println(String.format("선택한 상품 : %s | %,d원 | %s | 재고 : %d개",
                            productList.get(3).getProductName(), productList.get(3).getProductPrice(), productList.get(3).getProductExplain(),
                            productList.get(3).getProductPice()));
                    break;
                }
//                break;
            }
        }
    }
}