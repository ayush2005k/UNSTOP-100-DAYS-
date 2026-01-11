import java.util.*;

public class d {

    static class Point {
        int x, y;
        int dist; // squared distance

        Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.dist = x * x + y * y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Point[] points = new Point[N];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point(x, y);
        }

        int K = sc.nextInt();

        // Sort points by distance from origin
        Arrays.sort(points, Comparator.comparingInt(p -> p.dist));

        // Print K closest points
        for (int i = 0; i < K; i++) {
            System.out.println(points[i].x + " " + points[i].y);
        }

        sc.close();
    }
}
