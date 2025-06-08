

public class Clint {
    public static void main(String[] args) {
        User u1 = new User.UserBuilder().setUserEmail("safdarse063@gmail.com")
        .setUserId("BSE-20S-063")
        .setUserName("Safdar Hussain")
        .Build();

        System.out.println(u1);
    }
}
