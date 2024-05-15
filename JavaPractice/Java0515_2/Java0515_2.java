package Java0515_2;

public class Java0515_2 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.print(singleton1 == singleton2);
    }
}

class Singleton {
    private static Singleton one;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (one == null) {
            one = new Singleton();
        }
        return one;
    }
}
