public class Television extends techEquipments{
    public Television(String brand, String model, String color, double price, int expirationYear, boolean isSecondHand) {
        super(brand, model, color, price, expirationYear, isSecondHand);
    }

    public void reachToSatallite (){
        System.out.println(getBrand()+ " can reach the satellite easily.");
    }
}
