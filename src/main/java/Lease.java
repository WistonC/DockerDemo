public class Lease {
    private char name;
    private float interest;
    private float amount;
    private float balance;
    private float profit;

    public Lease(char name) {
        this.name = name;
    }

    public Lease(char name, float interest, float amount) {
        this.name = name;
        this.interest = interest;
        this.amount = amount;
        this.balance = (1+interest) * amount;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
        this.balance = (1+interest) * amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
        this.balance = (1+interest) * amount;
    }


    public float getBalance() {
        return balance;
    }

    public float getProfit() {
        return profit;
    }

    public float pay(float amount){
        System.out.println("Paid "+ this.name + " $"+ amount + " Current balance: $"+ (this.balance - amount));
        profit = (amount * interest) + profit;
        return this.balance -= amount;

    }
    @Override
    public String toString() {
        return "Lease{" +
                "name=" + name +
                ", interest=" + interest +
                ", amount=" + amount +
                ", balance=" + balance +
                '}';
    }
}
