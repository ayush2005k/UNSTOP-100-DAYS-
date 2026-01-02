import java.util.*;

public class d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();

            // If x is positive, just push
            if (x >= 0) {
                stack.push(x);
            } 
            // If x is negative, perform operation
            else {
                int need = Math.abs(x);
                int sum = 0;

                // Remove elements from stack
                while (!stack.isEmpty() && sum < need) {
                    sum += stack.pop();
                }

                // Push absolute value of x
                stack.push(need);
            }
        }

        // Calculate final sum
        long result = 0;
        for (int val : stack) {
            result += val;
        }

        System.out.println(result);
        sc.close();
    }
}
