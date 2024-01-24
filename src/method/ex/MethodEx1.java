package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {

    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static double avg(int a, int b, int c) {
        int sum = a + b + c;
        double avg = sum / 3.0;
        System.out.println("평균값 = " + avg);

        return avg;
    }
}
