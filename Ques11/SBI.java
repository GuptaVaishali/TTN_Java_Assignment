package Ques11;

public class SBI extends Bank{
    SBI(){
        this.bankName = "State Bank Of India";
        this.bankLocation = "Delhi";
        this.rateOfInterest = 3.5;
    }
    void getDetails(){
        System.out.println("Bank Name = " + bankName);
        System.out.println("Bank Location = " + bankLocation);
        System.out.println("Rate of Interest = " + rateOfInterest);
    }
}
