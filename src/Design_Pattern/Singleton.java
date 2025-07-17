package Design_Pattern;

public class Singleton {
    private static Singleton s = new Singleton();
    private Singleton(){
    }
    public static Singleton get(){
        return s ;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.get());
        System.out.println(Singleton.get());
    }
}
