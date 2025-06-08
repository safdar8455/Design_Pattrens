import java.util.ArrayList;
import java.util.List;

public class UserManagment {
    private List<User> userLists = new ArrayList<>();

    public void addUser(User user){
        userLists.add(user);
    }

    public User getUser(int index){
        return userLists.get(index);
    }

    public MyItrator getIrator(){
        return new MyItratorImp(userLists);
    }

}
