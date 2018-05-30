public class Square extends Figure {
    double border;

    public Square(){}

    public Square(double aBorder){
        border = aBorder;
    }

    public double area() {
        return border*border;
    }
}
