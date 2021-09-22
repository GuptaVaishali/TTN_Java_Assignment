public class Ques7 {
    private static String firstName;
    private static String lastName;
    private static int age;

    static{
        firstName = "Vaishali";
        lastName = "Gupta";
        age = 24;

        System.out.println("FirstName = " + firstName);
    }

    static void printLastName(){
        System.out.println("LastName = " + lastName);
    }

    public static void main(String[] args) {
        printLastName();
        System.out.println(age);
    }
}
