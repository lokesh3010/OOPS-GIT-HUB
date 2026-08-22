class College {
    private String name = "ABC College";

    class Student {
        void display() {
            System.out.println("College Name: " + name);
        }
    }

    public static void main(String[] args) {
        College obj = new College();
        College.Student s = obj.new Student();
        s.display();
    }
}
