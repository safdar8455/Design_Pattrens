import java.util.List;

public class MyItratorImp implements MyItrator{

    private List<User> list;
    private int length;
    private int position = 0;
    

    public MyItratorImp(List<User> list) {
        this.list = list;
        this.length = list.size();
    }

    @Override
    public boolean hasNext() {
        if (position>=length)
        return false;
        else
        return true;
    }

    @Override
    public Object next() {
        User user = list.get(position);
        position++;
        return user;
    }
    
}
