import java.util.*;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("Element found at index: " + position);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
