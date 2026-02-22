import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long prefixSum = 0;
        int goodCount = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            prefixSum += num;

            // Check if prefixSum has exactly one bit set
            if (prefixSum > 0 && (prefixSum & (prefixSum - 1)) == 0) {
                goodCount++;
            }
        }

        System.out.println(goodCount);

        sc.close();
    }
}
