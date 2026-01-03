import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String op = sc.next();

            if (op.equals("+")) {
                int last = stack.pop();
                int secondLast = stack.peek();
                stack.push(last);
                stack.push(last + secondLast);
            } 
            else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } 
            else if (op.equals("C")) {
                stack.pop();
            } 
            else {
                // Integer value
                stack.push(Integer.parseInt(op));
            }
        }

        long sum = 0;
        for (int score : stack) {
            sum += score;
        }

        System.out.println(sum);
        sc.close();
    }
}
