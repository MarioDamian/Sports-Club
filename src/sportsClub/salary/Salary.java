package sportsClub.salary;

public class Salary {
    private int amount;

    public Salary() {
    }

    public Salary(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "amount=" + amount +
                '}';
    }
}
