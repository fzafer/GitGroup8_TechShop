public class EarPods_Vahap extends TechEquipments_PARENT {
    public EarPods_Vahap(String brand, String model, String color, double price, int expirationYear, boolean isSecondHand) {
        super(brand, model, color, price, expirationYear, isSecondHand);
    }
    //assigned to Vahap from Zafer
    public void listen(String music){
        System.out.println("he is listening "+music+" with his "+getBrand()+" earpods");
    }
    public void buy(){
        System.out.println("You can buy "+getBrand()+" earpods $"+getPrice());
    }
}
