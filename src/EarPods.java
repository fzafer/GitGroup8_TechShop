public class EarPods extends techEquipments{
    public EarPods(String brand, String model, String color, double price, int expirationYear, boolean isSecondHand) {
        super(brand, model, color, price, expirationYear, isSecondHand);
    }
    //assigned to Vahap from Zafer
    public void listen(String music){
        System.out.println("he is listening "+music);
    }
}
