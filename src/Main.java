public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(1, 1, 4, 3, 0);
        Rectangle rec2 = new Rectangle(10, 0, 2, 10, 0);

        Circle cir1 = new Circle(5, 5, 5);
        Circle cir2 = new Circle(0, 0, 1);

        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 3);
        Point p3 = new Point(5, 0);
        Point p4 = new Point(10, 10);
        Point p5 = new Point(-1, 0);

        System.out.println(rec1.isContainPoint(p1));
        System.out.println(rec1.isContainPoint(p2));
        System.out.println(rec1.isContainPoint(p3));
        System.out.println(rec1.isContainPoint(p4));
        System.out.println(rec1.isContainPoint(p5));
    }
}