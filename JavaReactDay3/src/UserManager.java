public class UserManager {
    public void add(User user){
        System.out.println(user.getName()+" adlı kullanıcı eklendi.");
    }
    public void update(User user,int id,String name,String email,String phoneNumber,String birthdate){
        user.setId(id);
        user.setName(name);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        user.setBirthdate(birthdate);
        System.out.println(user.getName()+" adlı kullanıcı güncellendi.");
    }
    public void delete(User user){
        System.out.println(user.getName()+" adlı kullanıcı silindi.");
    }
}
