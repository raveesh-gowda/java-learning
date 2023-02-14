package exceptionhandling;

class Amount {
    private final String currency;
    private int amount;

    public Amount(String currency, int amount) {
        super();
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount other) throws Exception {
        if (!this.currency.equals(other.currency)) {
            throw new Exception("Currencies do not match: " + this.currency + " and " + other.currency);
        }
        this.amount += other.amount;
    }

    public String toString() {
        return amount + " " + currency;
    }
}

public class ThrowingExceptionRunner {

    public static void main(String[] args) {
        Amount amountOne = new Amount("USD", 10);
        Amount amountTwo = new Amount("EUR", 20);
//        Amount amountTwo = new Amount("USD", 20);

        try {
            amountOne.add(amountTwo);
            System.out.println(amountOne);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
