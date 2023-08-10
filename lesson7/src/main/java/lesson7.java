public class Lesson7 {
    class Phone {
        private String number;
        private String model;
        private double weight;

        // Constructors
        public Phone(String number, String model, double weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
        }

        public Phone(String number, String model) {
            this(number, model, 0.0);
        }

        public Phone() {
            this("", "", 0.0);
        }

        // Methods
        public void receiveCall(String callerName) {
            System.out.println("Звонит " + callerName);
        }

        public void receiveCall(String callerName, String callerNumber) {
            System.out.println("Звонит " + callerName + ", номер: " + callerNumber);
        }

        public String getNumber() {
            return number;
        }

        public void sendMessage(String... phoneNumbers) {
            System.out.println("Отправить сообщение на номера: " + String.join(", ", phoneNumbers));
        }
    }

    public class Main {
        public static void main(String[] args) {
            Phone phone1 = new Phone("123456789", "iPhone", 0.2);
            Phone phone2 = new Phone("987654321", "Samsung");
            Phone phone3 = new Phone();

            phone1.receiveCall("Арина");
            phone2.receiveCall("Илья "555-1234");
            phone3.receiveCall("Светлана");

            System.out.println("Номер телефона phone1: " + phone1.getNumber());
            System.out.println("Номер телефона phone2: " + phone2.getNumber());
            System.out.println("Номер телефона phone3: " + phone3.getNumber());

            phone1.sendMessage("111111111", "222222222");
            phone2.sendMessage("333333333");
            phone3.sendMessage("444444444", "555555555", "666666666");
        }
    }
}
