public class Main {

    public static void main(String[] args) {
        UserManagment userManagment = new UserManagment();

        userManagment.addUser(new User(1, "Safdar"));
        userManagment.addUser(new User(2, "Akhtar"));
        userManagment.addUser(new User(3, "Safia"));
        userManagment.addUser(new User(4, "Shafaq"));

        MyItrator myItrator =  userManagment.getIrator();

        while (myItrator.hasNext()) {
            User user = (User)myItrator.next();
            System.out.println(user.getUserId()+ " : "+user.getUserName());
        }
    }
}