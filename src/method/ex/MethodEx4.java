package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("==================");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("==================");

            int number = scanner.nextInt();
            System.out.println("선택 = " + number);
            scanner.nextLine();
            int amount;

            switch (number) {
                case 1:
                    System.out.println("입금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                case 2:
                    System.out.println("출금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);

                case 3:
                    System.out.println("현재 잔액 : " + balance + "원");
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }

    }

    public static int deposit(int y, int x) {
        y = 0;
        if(x > 0){
            y += x;
            System.out.println(x+"원을 입금하였습니다. 현재잔액 : " +y);
        }
        return y;
    }

    public static int withdraw(int wallet, int withdraw) {
        if (wallet > withdraw) {
            wallet -= withdraw;

            System.out.println(withdraw + "을 출금하여 현재 잔액 :  " + wallet);
        } else {
            System.out.println(withdraw + "을 출금하려 했으나 잔액이 부족합니다. ");
        }
        return wallet;
    }

}
