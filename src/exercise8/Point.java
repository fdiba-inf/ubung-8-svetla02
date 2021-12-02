package exercise8;
import java.util.Scanner;
public class Point {
    double x;
    double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
      this.x = x;
      this.y = y;
    }

    public Point(Point otherPoint) {
       x = otherPoint.x;
       y = otherPoint.y;
    }

    public void initialize() {
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();
         y = input.nextDouble();

    }

    public void translate(double xDelta, double yDelta) {
        x = x + xDelta;
        y = y + yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        double newX = x + xDelta;
        double newY = y + yDelta;
        return new Point(newX, newY);
    }

    public boolean equals(Point otherPoint) {
       boolean xEqual = Utils.equals(x, otherPoint.x);
       boolean yEqual = Utils.equals(y, otherPoint.y);
        return xEqual && yEqual;
    }

    public String toString() {
        
        return "(" + x + ", " + y + ")";
    }
}