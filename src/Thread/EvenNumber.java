package Thread;

public class EvenNumber extends Thread{
    EvenOdd e;

    public EvenNumber(EvenOdd obj) {
        this.e = obj;
    }
    public void run() {
        e.evenNumber();
    }
}
