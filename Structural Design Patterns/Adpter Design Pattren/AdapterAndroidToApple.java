public class AdapterAndroidToApple implements AppleCharger{
    private AdroidCharger charger;

    public AdapterAndroidToApple(AdroidCharger charger) {
        this.charger = charger;
    }

    @Override
    public void MobileCharge() {
        System.out.println("Charging with Adapter...");
        charger.MobileCharge();

            }
    
}
