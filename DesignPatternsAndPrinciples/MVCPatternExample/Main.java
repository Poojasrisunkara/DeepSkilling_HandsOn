package DesignPatternsAndPrinciples.MVCPatternExample;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Pooja","100625","A");
        StudentView studentView = new StudentView();

        StudentController sc = new StudentController(student, studentView);
        sc.updateView();
        sc.setStudentGrade("A+");
        System.out.println("After updating the grade: \n");
        sc.updateView();
        sc.getStudentId();
    }
}
