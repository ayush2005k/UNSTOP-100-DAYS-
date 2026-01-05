import java.util.*;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Q = sc.nextInt();
        HashMap<String, Long> stock = new HashMap<>();

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < Q; i++) {
            int type = sc.nextInt();
            String name = sc.next();
            long qty = sc.nextLong();

            if (type == 1) {
                // Add chocolates
                stock.put(name, stock.getOrDefault(name, 0L) + qty);
            } else {
                // Sell chocolates
                long available = stock.getOrDefault(name, 0L);
                long sold = Math.min(available, qty);

                output.append(sold).append("\n");
                stock.put(name, available - sold);
            }
        }

        System.out.print(output.toString());
        sc.close();
    }
}

