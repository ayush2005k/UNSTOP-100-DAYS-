import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSoFar = 0;

        for (int i = 0; i < N; i++) {
            maxSoFar = Math.max(maxSoFar, arr[i]);
            arr[i] = arr[i] + maxSoFar;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
