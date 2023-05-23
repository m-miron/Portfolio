public class CreditCard implements Valuable {
 private String cardNumber;
 private double balance;

    public CreditCard(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public double getValue() {
        return 0;
    }

}
