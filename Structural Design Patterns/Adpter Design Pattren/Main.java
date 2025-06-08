public class Main {
    public static void main(String[] args) {
        System.out.println("Code is strarted...");

        AdroidCharger adroidCharger = new SixtyVoltCharger();
        AppleCharger charger = new AdapterAndroidToApple(adroidCharger);

        IPhone13 iPhone13 = new IPhone13(charger);
        iPhone13.connectCharger();
    }
}
