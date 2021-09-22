package Ques9_Enum;

public class Ques9 {
    public static void main(String[] args) {
        for(HousePrice hp:HousePrice.values()){
            System.out.println(hp + " HAS PRICE OF " + hp.getPrice() + " LAKHS");
        }
    }
}
