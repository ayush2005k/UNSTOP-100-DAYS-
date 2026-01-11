import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        // k-th character in reversed string
        char result = s.charAt(n - k);

        System.out.println(result);
        sc.close();
    }
}
