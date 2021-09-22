import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1");
        int n = sc.nextInt();
        String[] arr1 = new String[n];
        System.out.println("Enter the size of array2");
        int m = sc.nextInt();
        String[] arr2 = new String[m];

        System.out.println("Enter the elements of array1");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.next();
        }

        System.out.println("Enter the elements of array2");
        for (int j = 0; j < m; j++) {
            arr2[j] = sc.next();
        }

        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i].equals(arr2[j])) {
                    System.out.println("Duplicate element " + arr1[i]);
                    break;
                }
            }
        }
    }
}


