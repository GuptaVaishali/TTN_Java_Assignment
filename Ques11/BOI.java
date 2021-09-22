package Ques11;

public class BOI extends Bank{
    BOI(){
        this.bankName = "Bank Of India";
        this.bankLocation = "Gurgaon";
        this.rateOfInterest = 8.5;
    }

    @Override
    void getDetails() {
        System.out.println("Bank Name = " + bankName);
        System.out.println("Bank Location = " + bankLocation);
        System.out.println("Rate of Interest = " + rateOfInterest);
    }
}
