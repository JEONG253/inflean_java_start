package scanner.ex;

public class ChangeVarEx1 {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
