package innerouter;

public class InnerOuter {

    public static void main(String[] args) {
        int result = outermostEvaluation(5);
        System.out.println("Result of outermost evaluation: " + result);
        int innermostResult = innermostEvaluation(5);
        System.out.println("Result of innermost evaluation: " + innermostResult);
    }
    
    public static int outermostEvaluation(int n) {
        System.out.println("Entering outermost with n = " + n);
        if (n <= 0) {
            System.out.println("Base case of outermost is: " + n);
            return 0;
        } else {
            int value = n + outermostEvaluation(n - 1);
            System.out.println("Return outermost with n = " + n + ", value = " + value);
            return value;
        }
    }
    
    public static int innermostEvaluation(int n) {
        System.out.println("Entering innermost with n = " + n);
        if (n <= 0) {
            System.out.println("Base case of innermost: " + n);
            return 0;
        } else {
            int value = innermostEvaluation(n - 1);
            value += n;
            System.out.println("Returning innermost with n = " + n + ", value = " + value);
            return value;
        }
    }
}

