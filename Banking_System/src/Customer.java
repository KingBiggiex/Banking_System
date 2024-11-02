public class Customer {
    private final String name;
    private final Bank_Account bankAccount;

    public Customer(String name, int accountNumber) {
        this.name = name;
        this.bankAccount = new Bank_Account(accountNumber);
    }

    public String getName() {
        return name;
    }

    public Bank_Account getBankAccount() {
        return bankAccount;
    }
}
