package basics;

import java.math.BigDecimal;

public class SimpleInterest {
    BigDecimal principal, interest;

    public SimpleInterest(String x, String y) {
        this.principal = new BigDecimal(x);
        this.interest = new BigDecimal(y).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int z) {
        return this.principal.add(this.principal.multiply(this.interest).multiply(new BigDecimal(z)));
    }

}
