import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int N = sc.nextInt();

        // Map to store frequency of each element
        Map<Integer, Long> frequencyMap = new HashMap<>();

        // Read array elements and build frequency map
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0L) + 1);
        }

        long totalPairs = 0;

        // For each number with frequency f,
        // number of valid pairs = f * (f - 1) / 2
        for (long freq : frequencyMap.values()) {
            if (freq > 1) {
                totalPairs += (freq * (freq - 1)) / 2;
            }
        }

        // Print result
        System.out.println(totalPairs);

        sc.close();
    }
}
