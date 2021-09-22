package Ques11;

public class ICICI extends Bank{
    ICICI(){
        this.bankName = "Bank Of India";
        this.bankLocation = "Faridabad";
        this.rateOfInterest = 6.5;
    }

    @Override
    void getDetails() {
        System.out.println("Bank Name = " + bankName);
        System.out.println("Bank Location = " + bankLocation);
        System.out.println("Rate of Interest = " + rateOfInterest);
    }
}
