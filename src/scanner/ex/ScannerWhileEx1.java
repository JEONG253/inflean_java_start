package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료) : ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다. ");
                break;
            }


            System.out.print("나이를 입력하세요 : ");
            int age = scanner.nextInt(); // nextInt 를 사용할때는 숫자만 가져가기 때문에 라인이 남아있을 수 있다
            scanner.nextLine(); // 이때 이것을 사용하면 다음줄로 넘어감.

            System.out.println("입력한 이름 : " + name + ", 나이 : " + age);


        }
    }
}
