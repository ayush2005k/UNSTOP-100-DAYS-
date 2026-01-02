import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String s = sc.next();

            boolean possible = true;
            int i = 0;

            while (i < N) {
                if (s.charAt(i) == 'W') {
                    i++;
                    continue;
                }

                // Start of a colored segment
                int j = i;
                boolean hasB = false;
                boolean hasR = false;

                while (j < N && s.charAt(j) != 'W') {
                    if (s.charAt(j) == 'B') hasB = true;
                    if (s.charAt(j) == 'R') hasR = true;
                    j++;
                }

                int len = j - i;

                // Check rules
                if (len == 1 || !(hasB && hasR)) {
                    possible = false;
                    break;
                }

                i = j;
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}
