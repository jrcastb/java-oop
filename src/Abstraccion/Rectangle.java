package Abstraccion;

public class Rectangle extends Figure implements IFigure {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void Draw() {
        System.out.println("Drawing rectagnle with dimensions: " +
                "Height: " + this.height + " width: " + this.width);
    }
    public double calculateArea() {
        double area = 0.0;
        if ((this.width > 0) && (this.height > 0)){
            area = this.height * this.width;
        }
        return area;
    }
}
