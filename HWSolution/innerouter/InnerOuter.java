package innerouter;

public class InnerOuter {

    public static void main(String[] args) {
        int result = outermostEvaluation(5);
        System.out.println("Result of outermost evaluation: " + result);

        System.out.println();

        int innermostResult = innermostEvaluation(5);
        System.out.println("Result of innermost evaluation: " + innermostResult);
    }

    // Outermost Evaluation Example
    public static int outermostEvaluation(int n) {
        System.out.println("Entering outermostEvaluation with n = " + n);
        if (n <= 0) {
            System.out.println("Base case reached in outermostEvaluation: " + n);
            return 0;
        } else {
            int value = n + outermostEvaluation(n - 1); // Recursive call
            System.out.println("Returning from outermostEvaluation with n = " + n + ", value = " + value);
            return value;
        }
    }

    // Innermost Evaluation Example
    public static int innermostEvaluation(int n) {
        System.out.println("Entering innermostEvaluation with n = " + n);
        if (n <= 0) {
            System.out.println("Base case reached in innermostEvaluation: " + n);
            return 0;
        } else {
            int value = innermostEvaluation(n - 1); // Recursive call
            value += n; // Add after the recursive call returns
            System.out.println("Returning from innermostEvaluation with n = " + n + ", value = " + value);
            return value;
        }
    }
}

