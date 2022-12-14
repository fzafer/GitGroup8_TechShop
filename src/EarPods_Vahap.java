public class EarPods_Vahap extends techEquipments{
    public EarPods_Vahap(String brand, String model, String color, double price, int expirationYear, boolean isSecondHand) {
        super(brand, model, color, price, expirationYear, isSecondHand);
    }
    //assigned to Vahap from Zafer
    public void listen(String music){
        System.out.println("he is listening "+music+" with his "+getBrand()+" earpods");
    }
}
