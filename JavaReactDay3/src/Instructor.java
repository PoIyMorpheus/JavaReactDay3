public class Instructor extends User{
    private String[] courses;

    public Instructor() {
        super();
    }

    public Instructor(int id, String name, String email, String phoneNumber, String birthdate, String[] courses) {
        super(id, name, email, phoneNumber,birthdate);
        this.courses = courses;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
