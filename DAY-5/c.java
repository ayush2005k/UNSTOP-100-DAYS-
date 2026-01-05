import java.util.*;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Q = sc.nextInt();
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Read queries and ACCUMULATE frequencies
        for (int i = 0; i < Q; i++) {
            int A = sc.nextInt(); // count
            int B = sc.nextInt(); // number
            freqMap.put(B, freqMap.getOrDefault(B, 0) + A);
        }

        // If only one unique number
        if (freqMap.size() <= 1) {
            System.out.println(0);
            return;
        }

        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            // Lowest frequency → smallest number
            if (freq < minFreq || (freq == minFreq && num < minNum)) {
                minFreq = freq;
                minNum = num;
            }

            // Highest frequency → largest number
            if (freq > maxFreq || (freq == maxFreq && num > maxNum)) {
                maxFreq = freq;
                maxNum = num;
            }
        }

        System.out.println(Math.abs(maxNum - minNum));
        sc.close();
    }
}
