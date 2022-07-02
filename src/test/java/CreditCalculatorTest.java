import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import java.util.Random;

public class CreditCalculatorTest {

    Random random = new Random();

    CreditCalculator creditCalculator = new CreditCalculator();

    @Test
    public void testMonthPay() {
        int money = (random.nextInt(8) + 1) * 100000;
        int month = random.nextInt(35) + 1;
        double interestRate =  ((random.nextInt(19) + 1) * 0.01);
        int expected = (int) Math.round  ((((((money * interestRate) / 12.0) * month) + money) / month));
        int result = creditCalculator.monthPay(month, money, interestRate);
        Assertions.assertEquals(expected, result);

    }

    @Test
    public void testSumMoney() {
        int money = (random.nextInt(8) + 1) * 100000;
        int month = random.nextInt(35) + 1;
        double interestRate =  ((random.nextInt(19) + 1) * 0.01);
        int expected = (int) Math.round  (((((money * interestRate) / 12.0) * month) + money));
        int result = creditCalculator.sumMoney(month, money, interestRate);
        Assertions.assertEquals(expected, result);

    }

    @Test
    public void testOverpayment() {
        int money = (random.nextInt(8) + 1) * 100000;
        int month = random.nextInt(35) + 1;
        double interestRate =  ((random.nextInt(19) + 1) * 0.01);
        int expected = (int) Math.round  ((((money * interestRate) / 12.0) * month));
        int result = creditCalculator.overpayment(month, money, interestRate);
        Assertions.assertEquals(expected, result);
    }

}
