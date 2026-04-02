import javax.smartcardio.Card;
import java.util.HashMap;
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

    // 장바구니
    private HashMap<Product, Integer> cart = new HashMap<>();


    // 생성자
    public CommerceSystem(List<Category> categoryList, Scanner scanner) {
        this.categoryList = categoryList;
        this.scanner = scanner;
    }

    private void displayCategoryList() {
        // 1. 카테고리 목록 출력
        System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
        int countCategory = 1;
        for (Category category : categoryList) {
            System.out.println(countCategory + ". " + category.getCategoryName());
            countCategory++;
        }
    }

    private int returnCategoryNumber() {
        // 2. 입력값 받기
        System.out.println("0. 종료      | 프로그램 종료");
        System.out.print("입력 : ");
        int inputCategory = scanner.nextInt();
        return inputCategory;
    }

    private String selectCategory(int inputCategory) {
        // 3. 카테고리 선택
        if (inputCategory == 0) {
            System.out.println("커머스 플랫폼을 종료합니다.");
            return "break";
        } else if (0 < inputCategory && inputCategory <= categoryList.size()) {
            selectedCategory = categoryList.get(inputCategory - 1);
            return "null";
        } else {
            System.out.println("올바른 숫자를 입력해주세요");
            return "continue";
        }
    }

    private void displayProductList() {
        List<Product> productList = selectedCategory.getProductList();
        int countProduct = 1;
        for (Product product : productList) {
            System.out.println(String.format("%d. %s | %,d | %s",
                    countProduct, product.getProductName(), product.getProductPrice(), product.getProductExplain()));
            countProduct++;
        }
    }

    private int returnProductNumber() {
        System.out.println("0. 뒤로가기");
        System.out.print("입력 : ");
        int inputProduct = scanner.nextInt();
        return inputProduct;
    }

    private String selectProduct(int inputProduct) {
        // 6. 상품 선택
        // 예외처리 먼저 하기 (0(종료),1(상품목록 선택),2(상품목록 선택), 3(상품목록 선택) 4(다시 입력))
        List<Product> productList = selectedCategory.getProductList();

        if (inputProduct == 0) {
            return "continue";
        } else if (0 < inputProduct && inputProduct <= productList.size()) {
            selectedProduct = productList.get(inputProduct - 1);
            return "null";
        } else {
            System.out.println("올바른 숫자를 입력해주세요");
            return "continue";
        }
    }

    private void displayProduct() {
        // 7. 상품 출력
        System.out.println(String.format("선택한 상품 : %s | %,d | %s | 재고 : %,d개",
                selectedProduct.getProductName(), selectedProduct.getProductPrice(),
                selectedProduct.getProductExplain(), selectedProduct.getProductQuantity()));
    }

    // 기능
    // 프로그램 시작 기능
    public void start() {
        while (true) {
            // displayCategoryList
            // 1. 카테고리 목록 출력
            displayCategoryList();

            // returnCategoryNumber
            // 2. 입력값 받기
            int inputCategory = returnCategoryNumber();

            // selectCategory
            // 3. 카테고리 선택
            String signalCategory = selectCategory(inputCategory);
            if (signalCategory.equals("break")) {
                break;
            } else if (signalCategory.equals("continue")) {
                continue;
            }

            // displayProductList
            // 4. 상품목록 출력
            displayProductList();

            // returnProductNumber
            // 5. 입력값 받기
            int inputProduct = returnProductNumber();

            // selectProduct
            // 6. 상품 선택
            String signalProduct = selectProduct(inputProduct);
            if (signalProduct.equals("break")) {
                break;
            } else if (signalProduct.equals("continue")) {
                continue;
            }

            // displayProduct
            // 7. 상품 출력
            displayProduct();

            // 장바구니
            // 입력값 받기
            System.out.println("위 상품을 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인        2. 취소");

            // 8. 장바구니에 추가할지 선택
            System.out.print("입력 : ");
            int addCart = scanner.nextInt();
            // 1 선택 : 추가 / 2 선택 : 취소 continue; 그 외 : 올바른 숫자를 입력하세요
            // 1이면 추가
            if (addCart == 1) {
                // 여기서 이미 있으면 + 1 담아주기(put 메서드)
                System.out.println("------------------------------1");
                if (cart.containsKey(selectedProduct)) {
                    System.out.println("------------------------------2");
                    cart.put(selectedProduct, cart.get(selectedProduct) + 1);
                    System.out.println(cart.get(selectedProduct));
                    // 없으면 그냥 한 개 담아주기
                } else {
                    cart.put(selectedProduct, 1);
                }
                System.out.println(selectedProduct.getProductName() + "가 장바구니에 추가되었습니다.");
                // 만약 2를 선택하면 취소
            } else if (addCart == 2) {
                continue;
            } else {
                System.out.println("올바른 번호를 입력하세요");
                continue;
            }

        }
    }
}