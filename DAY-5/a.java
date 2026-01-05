import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalBoxes = sc.nextInt(); // this is 2*n
        int n = totalBoxes / 2;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < totalBoxes; i++) {
            int label = sc.nextInt();
            freq.put(label, freq.getOrDefault(label, 0) + 1);
        }

        // Find the label repeated n times
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == n) {
                System.out.println(entry.getKey());
                break;
            }
        }

        sc.close();
    }
}
