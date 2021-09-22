import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        System.out.println("Enter a character to find occurance");
        char ch = sc.next().charAt(0);
        int count = 0;
        System.out.printf("Count of %c = %d" , ch, countFrequency(str,ch,count));
    }
    static int countFrequency(String str, char ch,int count){
        if(str.length() == 0)
            return count;
        else if(str.charAt(0) == ch)
            return countFrequency(str.substring(1),ch,++count);
        else
            return countFrequency(str.substring(1),ch,count);
    }
}
