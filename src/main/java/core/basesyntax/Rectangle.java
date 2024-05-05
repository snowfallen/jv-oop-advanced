package core.basesyntax;

public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + "rectangle," + " area : " + calculateArea()
                + " sq.units" + ", length : " + getLength() + " units," + " width : "
                + getWidth() + " units," + " color : " + getColor());
    }
}
