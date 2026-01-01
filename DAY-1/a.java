import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // Column: convert character to number (a=1, b=2, ...)
        int column = s.charAt(0) - 'a' + 1;

        // Row: convert character digit to integer
        int row = s.charAt(1) - '0';

        // Check color
        if ((column + row) % 2 == 0) {
            System.out.println("Black");
        } else {
            System.out.println("White");
        }

        sc.close();
    }
}