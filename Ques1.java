import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        System.out.println("Enter a substring to be replaced");
        String toReplaceStr = sc.nextLine();
        System.out.println("Enter a substring by which replaced");
        String replacedStr = sc.nextLine();

        String resultStr = null;

        if (str.contains(toReplaceStr)) {
            resultStr = str.replace(toReplaceStr, replacedStr);
        } else
            System.out.println("Does not contain substring");

        System.out.println("Resultant String " + resultStr);
    }
}

