import java.util.*;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[N];
        HashMap<String, Integer> freqMap = new HashMap<>();

        // Read strings and count frequency
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }

        int k = sc.nextInt();

        // Find k-th unique string in original order
        int count = 0;
        for (String s : arr) {
            if (freqMap.get(s) == 1) {
                count++;
                if (count == k) {
                    System.out.println(s);
                    sc.close();
                    return;
                }
            }
        }

        // If less than k unique strings
        System.out.println(-1);
        sc.close();
    }
}