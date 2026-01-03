import java.util.*;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Allowed components
        String components = sc.next();

        // Number of car models
        int n = sc.nextInt();

        // Store allowed components in a set
        Set<Character> allowed = new HashSet<>();
        for (char c : components.toCharArray()) {
            allowed.add(c);
        }

        int count = 0;

        // Process each car model
        for (int i = 0; i < n; i++) {
            String model = sc.next();
            boolean isConsistent = true;

            for (char c : model.toCharArray()) {
                if (!allowed.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
