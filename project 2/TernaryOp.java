package operators;

public class TernaryOp {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int max = (a > b) ? a : b;

        System.out.println(max+ " is greater");
    }
}