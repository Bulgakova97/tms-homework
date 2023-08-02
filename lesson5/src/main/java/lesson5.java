public class lesson5 {
    class CreditCard {
        private String accountNumber;
        private double balance;

        public CreditCard(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }

        public void displayInfo() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Current Balance: " + balance);
            System.out.println("-------------------------");
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Создаем три объекта класса CreditCard
            CreditCard card1 = new CreditCard("1111-1111-1111-1111", 1000);
            CreditCard card2 = new CreditCard("2222-2222-2222-2222", 2000);
            CreditCard card3 = new CreditCard("3333-3333-3333-3333", 500);

            // Положите деньги на первые две карточки
            card1.deposit(500);
            card2.deposit(1000);

            // Снимите с третьей карточки
            card3.withdraw(200);

            // Выводим текущее состояние всех трех карточек
            card1.displayInfo();
            card2.displayInfo();
            card3.displayInfo();
        }
    }
}
