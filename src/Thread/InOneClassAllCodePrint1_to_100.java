package Thread;

public class InOneClassAllCodePrint1_to_100 {
    int count = 1;
    public static final int N = 10;

    public void printEven() {
        synchronized (this) {
            while (count < N) {
                while (count % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even: " + count);
                count++;
                notify();
                try {
                    Thread.sleep(500); // Optional delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void printOdd() {
        synchronized (this) {
            while (count < N) {
                while (count % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd: " + count);
                count++;
                notify();
                try {
                    Thread.sleep(500); // Optional delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        InOneClassAllCodePrint1_to_100 obj = new InOneClassAllCodePrint1_to_100();

        Thread evenThread = new Thread(() -> obj.printEven());
        Thread oddThread = new Thread(() -> obj.printOdd());

        evenThread.start();
        oddThread.start();
    }

}
