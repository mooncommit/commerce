import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 객체화 (인스턴스화)
        // Product 전자제품 객체 만들기
        Category galaxy = new Category("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 0);
        Category iphone = new Category("iPhone 16", 1350000, "Apple의 최신 스마트폰", 10);
        Category macbook = new Category("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 100);
        Category airpods = new Category("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 40);

        // 의류 객체 만들기
        Category aloBag = new Category("Alo Bag", 67000, "여행갈 때 너무너무 예쁜 가방", 50);
        Category adidasShoes = new Category("Adidas Tokyo Core", 84000, "아이다스의 굿 아이템 신발", 20);
        Category casioClock = new Category("카시오 LTP-V007L-7B1", 30000, "가성비 완전 혁명 시계", 1000);
        Category adidasTop = new Category("Adidas Dot Track Top", 118000, "땡땡이가 매력점인 아우터", 2);


        // CommerceSystem 객체화
        CommerceSystem commerceSystem = new CommerceSystem(, scanner);

        // 전자제품 List
        List<Category> electronicsList = new ArrayList<>();
        electronicsList.add(galaxy);
        electronicsList.add(iphone);
        electronicsList.add(macbook);
        electronicsList.add(airpods);

        // 의류 List
        List<>


        // Category 객체화
        Category electronics = new Category(electronicsList, "전자제품");
        Category clothes = new Category(productList, "의류");

        electronics.getProductList();





        // 프로그램 시작
        commerceSystem.start();
    }

}
