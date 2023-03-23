package Abstraccion;

public class Square extends Figure implements IFigure{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void Draw() {
        System.out.println("Drawing square with: " +
                "Side: " + this.side );
    }
    public double calculateArea() {
        double area = 0.0;
        if(this.side > 0){
            area = this.side * this.side;
        }
        return area;
    }
}
