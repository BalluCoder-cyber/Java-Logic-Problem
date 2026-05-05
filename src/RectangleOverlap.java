class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

public class RectangleOverlap {

    boolean recOverlap(Point r1, Point l1, Point r2, Point l2) {
        if (r1.x < l2.x || r2.x < l1.x) return false;
        if (r2.y > l1.y || r1.y > l1.y) return false;

        return true;
    }

    public static void main(String[] args) {
        Point r1 = new Point(55,5);
        Point r2 = new Point(55, 35);
        Point l1 = new Point(25, 55);
        Point l2 = new Point(11, 55);
        RectangleOverlap r = new RectangleOverlap();
        if (r.recOverlap(r1,l1,r2,l2)){
            System.out.println("Rectangle is Overlapping...");
        }else{
            System.out.println("Rectangle is not Overlapping...");
        }

    }
}
