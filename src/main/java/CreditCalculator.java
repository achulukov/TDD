public class CreditCalculator {

    public int monthPay(int month, int money, double interestRate) {
        return  (int) Math.round  ((((((money * interestRate) / 12.0) * month) + money) / month));
    }

    public int sumMoney(int month, int money, double interestRate) {
        return (int) Math.round  (((((money * interestRate) / 12.0) * month) + money));
    }

    public int overpayment(int month, int money, double interestRate) {
        return (int) Math.round  ((((money * interestRate) / 12.0) * month));
    }

}
