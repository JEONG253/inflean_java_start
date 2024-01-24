package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        // 잔액
        int balance = 10000;

        // 입금
        int depositAmount = 1000;
        balance += depositAmount;
        System.out.println("현재 잔액 = " + balance);

        // 출금
        int withdrawAmount = 2000;
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount+ "원이 출금되어 현재 잔액 : " + balance);
        }else{
            System.out.println(withdrawAmount+"원을 출금하려 했으나 잔액이 부족합니다.");
        }


    }
}
