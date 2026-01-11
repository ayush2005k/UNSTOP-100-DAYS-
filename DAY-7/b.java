import java.util.*;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt(); // 2N
        int[] nums = new int[total];

        for (int i = 0; i < total; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        long maxSum = 0;
        for (int i = 0; i < total; i += 2) {
            maxSum += nums[i];
        }

        System.out.println(maxSum);
        sc.close();
    }
}
