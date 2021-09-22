class Operations{
    int add(int num1,int num2){
        return num1 + num2;
    }
    double add(double num1,double num2){
        return num1+num2;
    }
    int multiply(int num1,int num2){
        return num1*num2;
    }
    float multiply(float num1,float num2){
        return num1*num2;
    }
    String concatenate(String str1,String str2){
        return str1 + str2;
    }
    String concatenate(String str1,String str2,String str3){
        return str1 + str2 + str3;
    }
}
public class Ques10 {
    public static void main(String[] args) {
        Operations op = new Operations();
        System.out.println(op.add(2,3));
        System.out.println(op.add(2.5,3.50));
        System.out.println(op.multiply(2,3));
        System.out.println(op.multiply(3.2f,4.5f));
        System.out.println(op.concatenate("Vaishali ","Gupta"));
        System.out.println(op.concatenate("Tek ","Chand ","Gupta"));
    }
}
