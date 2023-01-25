import java.math.BigDecimal;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        SimpleInterest calculator = new SimpleInterest("4500.00", "7.5");
        BigDecimal totalValue = calculator.calculateTotalValue(5); //5 year duration
        System.out.println(totalValue);
    }

}
