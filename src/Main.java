import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 전자제품 객체
        Product galaxy = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 0);
        Product iphone = new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 10);
        Product macbook = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 20);
        Product airpods = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 100);

        // 의류 객체
        Product aloBag = new Product("Alo Bag", 67000, "여행갈 때 너무너무 예쁜 가방", 50);
        Product adidasShoes = new Product("Adidas Tokyo Core", 84000, "아이다스의 굿 아이템 신발", 20);
        Product casioClock = new Product("카시오 LTP-V007L-7B1", 30000, "가성비 완전 혁명 시계", 1000);
        Product adidasTop = new Product("Adidas Dot Track Top", 118000, "땡땡이가 매력점인 아우터", 2);


        // 전자제품 , 의류 리스트
        // List.of 사용 : 괄호 안의 값들로 리스트 만들기
        List<Product> electronics = new ArrayList<>(List.of(galaxy, iphone, macbook, airpods));
        List<Product> clothes = new ArrayList<>((List.of(aloBag, adidasShoes, casioClock, adidasTop)));

        // category 객체
        Category electronicsCategory = new Category("전자제품", electronics);
        Category clothesCategory = new Category("의류", clothes);

        // 카테고리 묶기
        List<Category> categoryList = new ArrayList<>(List.of(electronicsCategory, clothesCategory));

        // CommerceSystem 객체
        CommerceSystem commerceSystem = new CommerceSystem(categoryList, scanner);

        // 프로그램 시작
        commerceSystem.start();


    }

}