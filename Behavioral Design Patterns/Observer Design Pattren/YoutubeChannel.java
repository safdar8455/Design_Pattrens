import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {
    List<Observer> subsList = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
        this.subsList.add(ob);
        }

    @Override
    public void unSubscribe(Observer ob) {
        this.subsList.remove(ob);
    }

    @Override
    public void notifyChange(String title) {
        for (Observer observer : this.subsList) {
            observer.notified(title);
        }
    }
}
