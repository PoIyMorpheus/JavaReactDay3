public class Student extends User{
    private String schoolName;

    public Student() {
    }

    public Student(int id, String name, String email, String phoneNumber, String birthdate, String schoolName) {
        super(id, name, email, phoneNumber, birthdate);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
