public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(15000);

        while (true){
            try {
                account.withdraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                account.withdraw(e.getRemainedAmount());
                break;
            }
        }
    }
}
