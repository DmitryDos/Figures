public class Circle extends Figure{
    private double radius;
    public Circle(double x, double y, double rad) {
        super(x, y);
        radius = rad;
    }

    public boolean isContainPoint(Point point){
        if((point.xCord - xCord) * (point.xCord - xCord) + (point.yCord - yCord) * (point.yCord - yCord) < radius * radius){
            return true;
        }
        return false;
    }
}
