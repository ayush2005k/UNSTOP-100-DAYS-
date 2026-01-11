import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int maxSize = 0;

        for (int right = 0; right < N; right++) {
            // Remove submissions older than or equal to (t - 5000)
            while (arr[right] - arr[left] >= 5000) {
                left++;
            }
            maxSize = Math.max(maxSize, right - left + 1);
        }

        System.out.println(maxSize);
        sc.close();
    }
}
