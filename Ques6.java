//import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    /*    Arrays.sort(arr);

        int unique_element = -1;
        boolean isThere = false;

        for(int i=0;i<arr.length-1;i+=2){
            if(arr[i] != arr[i+1]){
                unique_element = arr[i];
                isThere = true;
                break;
            }
        }
        if(!isThere)
            unique_element = arr[arr.length -1];

        if(unique_element != -1)
            System.out.println("Unique Element is = " + unique_element);
        else
            System.out.println("Unique Element is not present in  array"); */

    /*    int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            ans = ans ^ arr[i];
        }
        System.out.println("Unique Element is = " + ans);  */

        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int element : arr) {
            int count = 0;
            if (mp.containsKey(element)) {
                int val = mp.get(element);
                mp.put(element, ++val);
            } else
                mp.put(element, ++count);
        }

        mp.forEach((key, value) -> {
            if(value == 1)
                System.out.println("Unique Element is = " + key);
            }
        );
    }
}
