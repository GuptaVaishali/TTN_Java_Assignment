import java.util.HashMap;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str  = sc.nextLine();
        String[] strArr = str.split(" ");
        HashMap<String,Integer> mp = new HashMap<String,Integer>();
        for(int i=0;i< strArr.length;i++){
            String word = strArr[i];
            int count = 0;
            if(mp.containsKey(word)){
                int val = mp.get(word);
                mp.put(word,++val);
            }
            else
                mp.put(word,++count);
        }
        if(mp!=null)
            mp.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
