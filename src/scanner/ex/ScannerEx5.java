package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하시오 : ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하시오 : ");
        int num2 = scanner.nextInt();

//        int temp;
//        System.out.print("두 숫자 사이의 모든 정수는 : ");
//
//
//            if(num1>num2) {
//                temp = num1;
//                num1 = num2;
//                num2 = temp;
//
//                for(int i =0; i<=num2-num1; i++) {
//                    System.out.print(num1 + i);
//                }
//            } else {
//                for(int i =0; i<=num2-num1; i++) {
//                    System.out.print(num1 + i);
//                }
//        }
        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print("두 숫자 사이의 모든 정수 : ");

        for(int i = num1; i <= num2; i++){
            System.out.print(i);
            if(i != num2){
                System.out.print(",");
            }
        }

    }
}
