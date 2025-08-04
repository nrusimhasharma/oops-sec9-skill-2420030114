import java.util.*;

public class StringMethodsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("\nOriginal string: \"" + str + "\"");

        System.out.println("Length: " + str.length());

        System.out.println("Uppercase: " + str.toUpperCase());

        System.out.println("Lowercase: " + str.toLowerCase());



        sc.close();
    }
}
