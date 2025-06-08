# Observer Design Pattern – YouTube Channel Example

This project demonstrates the **Observer Design Pattern** in Java, simulating a YouTube channel with subscribers.

---

## How It Works

- **Subject**: `YoutubeChannel` manages a list of subscribers.
- **Observer**: `Subscriber` receives notifications when a new video is posted.
- **Main**: Allows users to add/remove subscribers and post videos via console input.

---

## Main Application Flow

```java
System.out.println("1. Add Subscriber press 1 ...");
System.out.println("2. Remove Subscriber press 2 ...");
System.out.println("3. Post Video press 3 ...");
int Input = Integer.parseInt(br.readLine());

if (Input == 1) {
    System.out.println("Enter Subscrber Name:  ");
    String subsName = br.readLine();
    Observer subscriber = new Subscriber(subsName);
    channel.subscribe(subscriber);
    // Subscriber added
} else if (Input == 2) {
    System.out.println("Enter Subscrber Name:  ");
    String subsName = br.readLine();
    Observer subscriber = new Subscriber(subsName);
    channel.unSubscribe(subscriber);
    // Subscriber removed
} else if (Input == 3) {
    System.out.println("Enter the title of Video:  ");
    String vTitle = br.readLine();
    channel.notifyChange(vTitle);
    // All subscribers notified
} else {
    System.out.println("Wrong Entry.....");
    break;
}
```
#### Example Classes
##### Observer Interface

```java
public interface Observer {
    void notified(String title);
}
```
##### Subscriber Implementation
```java
public class Subscriber implements Observer {
    private String subscriberName;
    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }
    @Override
    public void notified(String title) {
        System.out.println("Hello " + this.subscriberName + " " + title + " Video posted......");
    }
}

```

#### Subject Interface
```java
public interface Subject {
    void subscribe(Observer ob);
    void unSubscribe(Observer ob);
    void notifyChange(String title);
}
```

#### YoutubeChannel Implementation

```java
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
```

#### Usage
1. **Add Subscriber**: Enter a name to subscribe.
2. **Remove Subscriber**: Enter a name to unsubscribe.
3. **Post Video**: Enter a video title to notify all subscribers.
This pattern decouples the subject from its observers, allowing dynamic subscription and notification.

