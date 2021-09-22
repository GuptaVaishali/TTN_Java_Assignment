import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str =  sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        System.out.println("Reversed String = " + sb.reverse());
        System.out.println("After Deleting character from 4 to 9 = " + sb.delete(4,10));
    }
}
