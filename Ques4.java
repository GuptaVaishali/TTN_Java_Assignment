import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int lc =0,uc =0,spc = 0,dc = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) >=97 && str.charAt(i) <=122)
                lc++;
            else if(str.charAt(i) >=65 && str.charAt(i) <= 92)
                uc++;
            else if(str.charAt(i) >=48 && str.charAt(i) <= 57)
                dc++;
            else
                spc++;
        }
        System.out.printf("lowercase characters count %d and Percentage %3.2f\n", lc , (((double)lc/str.length()))*100);
        System.out.printf("uppercase characters count %d and Percentage %3.2f\n", uc , (((double)uc/str.length()))*100);
        System.out.printf("Digits characters count %d and Percentage %3.2f\n", dc , (((double)dc/str.length()))*100);
        System.out.printf("Special characters count %d and Percentage %3.2f\n", spc , (((double)spc/str.length()))*100);
    }
}
