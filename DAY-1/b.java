import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] inDegree = new int[n + 1];
        int[] outDegree = new int[n + 1];

        // Read gift exchanges
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            outDegree[a]++;
            inDegree[b]++;
        }

        // Find the youngest member
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == n - 1 && outDegree[i] == 0) {
                System.out.println(i);
                sc.close();
                return;
            }
        }

        // If no such member exists
        System.out.println(-1);
        sc.close();
    }
}