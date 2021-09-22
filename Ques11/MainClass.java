package Ques11;

public class MainClass {
    public static void main(String[] args) {
        Bank b = new SBI();
        b.getDetails();
        System.out.println();
        b = new BOI();
        b.getDetails();
        System.out.println();
        b = new ICICI();
        b.getDetails();
    }
}
