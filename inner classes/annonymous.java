abstract class Vehicle {
    abstract void run();
}

class TestAnonymous {
    public static void main(String[] args) {

        Vehicle v = new Vehicle() {
            void run() {
                System.out.println("Car is running");
            }
        };

        v.run();
    }
}