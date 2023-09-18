public class Rectangle extends Figure{
    private double height;
    private double width;
    private double angle;

    public Rectangle(double x, double y, double h, double w, double a) {
        super(x, y);
        height = h;
        width = w;
        angle = a;
    }

    public boolean isContainPoint(Point point){
        if(Math.abs(point.xCord - xCord) * 2 < width && Math.abs(point.yCord - yCord) * 2 < height){
            return true;
        }
        return false;
    }
}
