import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());

        ArrayList<Point> pointsList = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 4; j++) {
                StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
                int x = Integer.parseInt(tokenizer.nextToken());
                int y = Integer.parseInt(tokenizer.nextToken());
                pointsList.add(new Point(x, y));
            }

            pointsList.sort(new PointComparator()); 

            int x0 = pointsList.get(0).x;
            int x1 = pointsList.get(1).x;
            int x2 = pointsList.get(2).x;
            int x3 = pointsList.get(3).x;

            int y0 = pointsList.get(0).y;
            int y1 = pointsList.get(1).y;
            int y2 = pointsList.get(2).y;
            int y3 = pointsList.get(3).y;

            int powD01 = (int) (Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2));
            int powD02 = (int) (Math.pow(x0 - x2, 2) + Math.pow(y0 - y2, 2));
            int powD13 = (int) (Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
            int powD23 = (int) (Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
            int powD12 = (int) (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

            boolean isRectangle = powD12 == powD01 + powD02;

            if (isRectangle && (powD01 == powD02) && (powD02 == powD13) && (powD13 == powD23)) {
                System.out.println(1); 
            } else {
                System.out.println(0); 
            }

            pointsList.clear(); 
        }
    }

    private static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static class PointComparator implements Comparator<Point> {
        @Override
        public int compare(Point p1, Point p2) {
            if (p1.x != p2.x) {
                return p2.x - p1.x;
            } else {
                return p2.y - p1.y;
            }
        }
    }
}
