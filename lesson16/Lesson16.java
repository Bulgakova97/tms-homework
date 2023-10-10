public class Lesson16 {
    public class ThreadSequence {
        public static void main(String[] args) {
            Thread t1 = new Thread(() -> {
                System.out.println("Thread 1 is running");
            });

            Thread t2 = new Thread(() -> {
                try {
                    t1.join(); // Ждем, пока t1 завершится
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 is running");
            });

            Thread t3 = new Thread(() -> {
                try {
                    t2.join(); // Ждем, пока t2 завершится
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 3 is running");
            });

            t1.start();
            t2.start();
            t3.start();
        }
    }

}
