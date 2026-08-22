class Laptop {
    String brand;
    int price;

    
    Laptop() {
        brand = "Unknown";
        price = 0;
    }

    
    Laptop(String b, int p) {
        brand = b;
        price = p;
    }

    
    Laptop(Laptop l) {
        brand = l.brand;
        price = l.price;
    }

    
    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        // Using Default Constructor
        Laptop l1 = new Laptop();

        // Using Parameterized Constructor
        Laptop l2 = new Laptop("Lenovo", 55000);

        // Using Copy Constructor
        Laptop l3 = new Laptop(l2);

        System.out.println("Default Constructor:");
        l1.display();

        System.out.println("Parameterized Constructor:");
        l2.display();

        System.out.println("Copy Constructor:");
        l3.display();
    }
}