package operator;

public class Comp2 {

    public static void main(String[] args) {

        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result = "hello".equals("hello");
        boolean result2 = str1.equals("문자열1");
        boolean result3 = str1.equals(str2);

        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

    }
}
