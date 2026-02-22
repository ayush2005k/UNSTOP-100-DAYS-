import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine().trim());
        String s = br.readLine().trim();
        
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;

        // Transform string
        char[] t = new char[2 * s.length() + 1];
        for (int i = 0; i < t.length; i++) {
            if (i % 2 == 0)
                t[i] = '#';
            else
                t[i] = s.charAt(i / 2);
        }

        int[] p = new int[t.length];
        int center = 0, right = 0;
        int maxLen = 0;

        for (int i = 0; i < t.length; i++) {
            int mirror = 2 * center - i;

            if (i < right)
                p[i] = Math.min(right - i, p[mirror]);

            // Expand around center
            int left = i - (p[i] + 1);
            int r = i + (p[i] + 1);

            while (left >= 0 && r < t.length && t[left] == t[r]) {
                p[i]++;
                left--;
                r++;
            }

            // Update center and right
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            maxLen = Math.max(maxLen, p[i]);
        }

        return maxLen;
    }
}
