class StudentScore {

    
    void calculate(int mark1) {
        System.out.println("Score for one subject: " + mark1);
    }

    
    void calculate(int mark1, int mark2) {
        System.out.println("Total for two subjects: " + (mark1 + mark2));
    }
    void calculate(int mark1, int mark2, int mark3) {
        System.out.println("Total for three subjects: " + (mark1 + mark2 + mark3));
    }

    public static void main(String[] args) {

        StudentScore student = new StudentScore();

        student.calculate(85);
        student.calculate(85, 90);
        student.calculate(85, 90, 95);
    }
}