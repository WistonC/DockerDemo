public class HelloWorld {
    public static void main(String[] args) {
        Lease a = new Lease('a', 0.1f, 100);
        Lease b = new Lease('b');
        Lease c = new Lease('c');
        float balance = 100;
        for (int i = 0; i < 3; i++) {
            // Lease b = new Lease('b', a.getInterest() + 0.1f, a.getBalance() * 1.5f);
            b.setAmount(a.getBalance() * 1.5f);
            b.setInterest(a.getInterest() + 0.1f);
            balance += b.getBalance() * (1 - b.getInterest());
            balance -= a.pay(a.getBalance());
            // Lease c = new Lease('c', b.getInterest() + 0.1f, b.getBalance() * 1.5f);
            c.setAmount(b.getBalance() * 1.5f);
            c.setInterest(b.getInterest() + 0.1f);
            balance += c.getBalance() * (1 - c.getInterest());
            balance -= b.pay(b.getBalance());
            a.setAmount(c.getBalance() * 1.5f);
            a.setInterest(c.getInterest() + 0.1f);
            balance += a.getBalance() * (1 - a.getInterest());
            System.out.println(balance);
        }
        System.out.println(balance);
        System.out.println(a.getProfit());
        System.out.println(b.getProfit());
        System.out.println(c.getProfit());
    }
}
