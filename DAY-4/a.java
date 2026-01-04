import java.util.*;

public class Main {

    static int[] left, right;
    static int maxDiameter = 0;

    static int dfs(int node) {
        if (node == -1) return 0;

        int lh = dfs(left[node]);
        int rh = dfs(right[node]);

        // Diameter through this node
        maxDiameter = Math.max(maxDiameter, lh + rh + 1);

        // Height of subtree
        return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        left = new int[n + 1];
        right = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }

        dfs(1); // Tree is rooted at 1

        System.out.println(maxDiameter);
        sc.close();
    }
}
