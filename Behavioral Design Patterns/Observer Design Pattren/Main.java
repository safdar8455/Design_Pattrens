import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("Creating Observer Design Pattren.......");
        Subject channel = new YoutubeChannel();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("1. Add Subscriber press 1 ...");
            System.out.println("2. Remove Subscriber press 2 ...");
            System.out.println("3. Post Video press 3 ...");
            int Input = Integer.parseInt(br.readLine());

            if (Input == 1) {
                System.out.println("Enter Subscrber Name:  ");
                String subsName = br.readLine();
                Observer subscriber = new Subscriber(subsName);
                channel.subscribe(subscriber);
                // Write Code

            } else if (Input == 2) {
                System.out.println("Enter Subscrber Name:  ");
                String subsName = br.readLine();
                Observer subscriber = new Subscriber(subsName);
                channel.unSubscribe(subscriber);
                // Write Code
            }  else if (Input == 3) {
                System.out.println("Enter the title of Video:  ");
                String vTitle = br.readLine();
                channel.notifyChange(vTitle);
                // Write Code
            } else {
                System.out.println("Wrong Entry.....");
                break;
            }

        }

    }
}
