package hw15.Student;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setFirstName("Pavel");
        System.out.println("After updating, Student.Student Details are as follows");
        controller.updateView();
    }
    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setFirstName("Gavril");
        student.setLastName("Senkevich");
        student.setCourse(2);
        student.setGroup("IKBO-30-22");
        return student;
    }
}