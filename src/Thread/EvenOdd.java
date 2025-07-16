package Thread;

public class EvenOdd {
    int count = 1;
    public static int N = 10;

// here we are using synchronized block because
// we want only one thread (either even or odd) to access the critical section at a time.
// This prevents both threads from printing at the same time and ensures proper ordering.
// It also allows correct usage of wait() and notify(), which require the current thread to hold the object's monitor.

    public void evenNumber() {
        synchronized (this) {
            while (count < N) {
                while (count % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("even: " + count);
                count++;
                try {
                    Thread.sleep(500);  // <-- Sleep after printing
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notify();
            }
        }
    }





    public void odddNumber() {
        synchronized (this) {
            while (count < N) {
                while (count % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("odd: " + count);
                count++;
                try {
                    Thread.sleep(500);  // <-- Sleep after printing
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notify();
            }
        }
    }




    public static void main(String[] args) {
        EvenOdd Obj = new EvenOdd();
        EvenNumber t1 = new EvenNumber(Obj);
        OddNumber t2 = new OddNumber(Obj);
        t1.start();
        t2.start();
    }

}
