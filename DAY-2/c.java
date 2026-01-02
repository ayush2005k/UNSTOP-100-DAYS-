import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int currentAltitude = 0;
        int maxAltitude = 0;

        for (int i = 0; i < n; i++) {
            int gain = sc.nextInt();
            currentAltitude += gain;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        System.out.println(maxAltitude);
        sc.close();
    }
}
