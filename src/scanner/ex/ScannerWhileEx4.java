package scanner.ex;

import java.util.Scanner;


public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 : 상품 입력, 2 : 결제 , 3 : 프로그램 종료 ");

        int option = scanner.nextInt();
        String productName;
        int price = 0;
        int quantity =0;
        int totalPrice = 0;

        switch (option){
            case 1:
                System.out.print("상품 명을 입력하세요 : ");
                productName = scanner.nextLine();
                System.out.print("상품의 가격을 입력하세요 : ");
                price = scanner.nextInt();
                scanner.nextLine();
                System.out.print("상품의 수량을 입력하세요 : ");
                quantity = scanner.nextInt();
                totalPrice = price * quantity;
                System.out.println("상품명 : " + productName + " 가격:"+productName + "수량:"+quantity + "합계:" + totalPrice);
                break;
            case 2:
                System.out.print("총 비용 : " + totalPrice );
//                clear();
                break;
            case 3:
                System.out.println("프로그램 종료");
                break;
            default:
                System.out.println("올바른 옵션을 선택해주세요.");
                break;

        }


    }
}
