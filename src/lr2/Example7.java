package lr2;

public class Example7 {

    interface BankAccountInterface {
        void deposit(double amount);
        void withdraw(double amount);
        double getBalance();
    }

    static class BankAccount implements BankAccountInterface {
        private double balance;

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        @Override
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Депозит на сумму " + amount + " рублей выполнен успешно.");
            } else {
                System.out.println("Неверная сумма для депозита.");
            }
        }

        @Override
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Снятие на сумму " + amount + " рублей выполнено успешно.");
            } else {
                System.out.println("Неверная сумма для снятия или недостаточно средств на счете.");
            }
        }

        @Override
        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        // Создание объекта банковского счета с начальным балансом 1000 рублей
        BankAccount account = new BankAccount(0);

        // Депозит и снятие денег
        account.deposit(500);
        account.withdraw(200);

        // Получение текущего баланса
        System.out.println("Текущий баланс: " + account.getBalance() + " рублей.");
    }


}
