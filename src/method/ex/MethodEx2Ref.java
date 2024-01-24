package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {

        print("hi jeje", 5);
        print("hi lhs", 6);
        print("hi lks", 7);
    }

    public static void print(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("messages" + message);

        }
    }

}
