import java.util.Arrays;

public class InstructorManager extends UserManager{

    public void addCourse(Instructor instructor,String course){

        String[] temp = instructor.getCourses();

        //İnternetten listeye pythondaki gibi nasıl append işlemi yapılır diye araştırdım.
        temp = Arrays.copyOf(temp, temp.length + 1);
        temp[temp.length - 1] = course;

        instructor.setCourses(temp);
    }


}
