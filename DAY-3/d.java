import java.util.*;

public class d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int n = a.length();
        int m = b.length();

        // Prefix sum of number of '1's in b
        int[] prefixOnes = new int[m + 1];
        for (int i = 0; i < m; i++) {
            prefixOnes[i + 1] = prefixOnes[i] + (b.charAt(i) == '1' ? 1 : 0);
        }

        long totalDiff = 0;

        // Compare each position of a
        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i + (m - n); // inclusive range in b

            int ones = prefixOnes[right + 1] - prefixOnes[left];
            int windowSize = m - n + 1;

            if (a.charAt(i) == '0') {
                totalDiff += ones;
            } else {
                totalDiff += (windowSize - ones);
            }
        }

        System.out.println(totalDiff);
        sc.close();
    }
}

