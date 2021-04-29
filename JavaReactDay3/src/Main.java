import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Instructor instructor=new Instructor();

        instructor.setId(1);
        instructor.setName("Engin Demirog");
        instructor.setEmail("engindemirog@gmail.com");
        instructor.setPhoneNumber("5554443322");
        instructor.setBirthdate("01/01/1980");
        instructor.setCourses(new String[]{"Java + React"});

        Student student = new Student();

        student.setId(2);
        student.setName("Recep Batuhan Dikmen");
        student.setEmail("r_batuhan@gmail.com");
        student.setPhoneNumber("5432148796");
        student.setBirthdate("01/01/2001");
        student.setSchoolName("Eskişehir Teknik Üniversitesi");

        InstructorManager instructorManager = new InstructorManager();

        instructorManager.add(instructor);
        instructorManager.delete(instructor);

        System.out.println(Arrays.toString(instructor.getCourses()));
        instructorManager.addCourse(instructor, "Python + Django");
        System.out.println(Arrays.toString(instructor.getCourses()));

        StudentManager studentManager = new StudentManager();

        studentManager.add(student);
        studentManager.delete(student);
        studentManager.signCourse(student, "Java + React");


    }
}
