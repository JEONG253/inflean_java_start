package cond.ex;

public class CondOpEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        String result = (a > b) ? "더 큰 숫자는 10 입니다." : "더 큰 숫자는 20 입니다.";
//        System.out.println("result = " + result);
        int max = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + max + "입니다");

    }
}
