public class BankAccount implements Valuable {
    private int id;
    private String owner;
    private double balance;

    public BankAccount(int id, String owner, double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public double getValue() {
        return 0;
    }


}
