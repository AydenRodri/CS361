package fibonacci;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n < 0 || n > 46) {
            throw new IllegalArgumentException("n must be a positive integer between 0 and 46");
        } else if (n == 0 || n == 1 || n == 2) {
            return 1;
        } else {
            int a = 0, b = 1;
                for (int i = 2; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        int n = 46;
        System.out.println("Fibonacci of " + n + " is " + fibonacci(n));
    }
}
