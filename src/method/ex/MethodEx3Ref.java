package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 1000);

        balance = withdraw(balance, 5000);
        System.out.println("최종 잔액 = " + balance);
    }

    public static int withdraw(int wallet, int deposit) {

        if (wallet >= deposit) {
            wallet-= deposit;
            System.out.println(deposit+ "원이 출금되어 현재 잔액 : " + wallet);
        }else {
            System.out.println(deposit+"원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return wallet;
    }

    public static int deposit(int wallet, int amount) {
        wallet += amount;
        System.out.println( amount + "원을 입금하였습니다. 현재 잔액 = " + wallet + "원");
        return wallet;
    }

}
