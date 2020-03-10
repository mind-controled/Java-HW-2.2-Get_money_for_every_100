public class Main {
    public static void main(String[] args) {
        long currentPayment = 1100;
        long minAmount = 1000;
        long bonusPercent = 1;
        long bonus;
        if (currentPayment > minAmount) {
            bonus = currentPayment * bonusPercent / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}