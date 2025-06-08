public class Subscriber implements Observer {

    private String subscriberName;

    public  Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }



    @Override
    public void notified(String title) {
        System.out.println("Hello " + this.subscriberName + " " + title + " Video posted......");
    }

}
