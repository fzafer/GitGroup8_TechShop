public class MobilePhone extends techEquipments{
    public MobilePhone(String brand, String model, String color, double price, int expirationYear, boolean isSecondHand) {
        super(brand, model, color, price, expirationYear, isSecondHand);

    }
    //assigned to Zafer

    public String screenSize;
    public String OperatingSystem;
    public int storage;
    public int RAM;
    public int screenResolution;
    public int maxCamResolution;


    public boolean hasRemovableBattery;
    public boolean hasMemoryCardSupport;
    public boolean hasWirelessCharging;

    public void call(long phoneNumber) {
        System.out.println(getBrand() + " " + getModel() + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(getBrand() + " " + getModel() + " is texting " + phoneNumber);
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "screenSize='" + screenSize + '\'' +
                ", OperatingSystem='" + OperatingSystem + '\'' +
                ", storage=" + storage +
                ", RAM=" + RAM +
                ", screenResolution=" + screenResolution +
                ", maxCamResolution=" + maxCamResolution +
                ", hasRemovableBattery=" + hasRemovableBattery +
                ", hasMemoryCardSupport=" + hasMemoryCardSupport +
                ", hasWirelessCharging=" + hasWirelessCharging +
                '}';
    }
}

