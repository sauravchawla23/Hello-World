package Thread;

public class OddNumber extends Thread {
    EvenOdd e;

    public OddNumber(EvenOdd obj) {
        this.e = obj;
    }
    public void run() {
        e.odddNumber();
    }
}
