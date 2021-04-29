public class StudentManager extends UserManager{
    public void signCourse(Student student,String course){
        System.out.println(student.getName()+" adlı öğrenci "+course+" adlı kursa kayıt oldu.");
    }

    public void update(Student student,int id,String name,String email,String phoneNumber,String birthdate,String schoolName){
        student.setId(id);
        student.setName(name);
        student.setEmail(email);
        student.setPhoneNumber(phoneNumber);
        student.setBirthdate(birthdate);
        student.setSchoolName(schoolName);

        System.out.println(student.getName()+" adlı öğrenci güncellendi.");
    }
}
