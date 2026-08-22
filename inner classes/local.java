class Employee {
    private int salary = 25000;

    void display() {
        int bonus = 5000;

        class Details {
            void show() {
                System.out.println("Salary: " + salary);
                System.out.println("Bonus: " + bonus);
            }
        }

        Details d = new Details();
        d.show();
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}
