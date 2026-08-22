abstract class Bird {
    abstract void fly();

    void eat() {
        System.out.println("Bird is eating");
    }
}

class Parrot extends Bird {
    void fly() {
        System.out.println("Parrot is flying");
    }
}

public class Main {
    public static void main(String[] args) {
        Parrot p = new Parrot();

        p.fly();
        p.eat();
    }
}
