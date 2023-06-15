public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withdraw (double sum) {
        if (sum > amount){
            throw new LimitException("The sum exceeds the limit. The remained amount possible to withdraw is " + getAmount(), getAmount());
        }
        amount -= sum;
        System.out.println(sum + " withdrawn\n" +
                            amount + " left\n");
    }
}
