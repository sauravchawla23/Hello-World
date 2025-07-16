package Thread;

public class EvenOdd {
    int count = 1;
    public static int N = 10;
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
