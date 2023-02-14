package exceptionhandling;

class CurrenciesDoNotMatchException extends Exception {
    public CurrenciesDoNotMatchException(String msg) {
        super(msg);
    }
}

class AmountTwo {
    private final String currency;
    private int amount;

    public AmountTwo(String currency, int amount) {
        super();
        this.currency = currency;
        this.amount = amount;
    }

    public void add(AmountTwo other) throws Exception {
        if (!this.currency.equals(other.currency)) {
            throw new CurrenciesDoNotMatchException("Currencies do not match: " + this.currency + " and " + other.currency);
        }
        this.amount += other.amount;
    }

    public String toString() {
        return amount + " " + currency;
    }
}

public class ThrowingCustomExceptionRunner {

    public static void main(String[] args) {
        AmountTwo amountOne = new AmountTwo("USD", 10);
        AmountTwo amountTwo = new AmountTwo("EUR", 20);
//        Amount amountTwo = new Amount("USD", 20);

        try {
            amountOne.add(amountTwo);
            System.out.println(amountOne);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
