package day39_Recap;

public class Square extends Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            System.err.println("invalid side : "+side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }

    }

