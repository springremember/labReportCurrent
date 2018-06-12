public class Square extends Geometry {
    private double border;

    public Square(){}

    public Square(double border){
        this.border = border;
    }

    public double getArea(){
        return border * border;
    }

    public double getPerimeter(){
        return 4 * border;
    }
}
