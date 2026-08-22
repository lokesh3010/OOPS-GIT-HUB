class University {
    static String course = "Computer Science";

    static class Department {
        void display() {
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {
        University.Department d = new University.Department();
        d.display();
    }
}
