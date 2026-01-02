import java.util.*;

public class a {

    static class SubArray {
        int l, r;
        SubArray(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }

        // Prefix sum
        long[] prefix = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }

        // Map sum -> list of subarrays with that sum
        HashMap<Long, List<SubArray>> map = new HashMap<>();

        // Generate all subarrays
        for (int l = 1; l <= N; l++) {
            for (int r = l; r <= N; r++) {
                long sum = prefix[r] - prefix[l - 1];
                map.computeIfAbsent(sum, k -> new ArrayList<>())
                   .add(new SubArray(l, r));
            }
        }

        long count = 0;

        // Count non-overlapping pairs
        for (List<SubArray> list : map.values()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    SubArray a = list.get(i);
                    SubArray b = list.get(j);

                    if (a.r < b.l || b.r < a.l) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
