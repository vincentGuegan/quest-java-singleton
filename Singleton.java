public class Singleton {

    // singleton declaration
    private static Singleton instance;

    // TODO 1 : fix singleton bad implementation
    public static Singleton getInstance() {
        if (instance==null){
            // if no instance exists, create one
            instance = new Singleton();
        }
        // in any case, return the same instance
        return instance;
    }

    // private constructor to avoid new instances
    private Singleton() {};

    // infos stored into the singleton
    private Bank bank;

    public void openAccount(int value) {
        bank = new Bank(value);
    }

    public void deposit(int value) {
        bank.setTotal(bank.getTotal() + value);
    }

    public void withdraw(int value) {
        bank.setTotal(bank.getTotal() - value);
    }

    public Bank getBank() {
        return bank;
    }
}