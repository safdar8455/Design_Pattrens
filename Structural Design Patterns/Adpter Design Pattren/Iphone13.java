class IPhone13 {
    private AppleCharger charger;
    
    public IPhone13(AppleCharger charger) {
        this.charger = charger;
    }

    void connectCharger(){
        charger.MobileCharge();
    }
}
