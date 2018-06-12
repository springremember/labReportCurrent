public class Circle implements Shape{
    private double r;

    public Circle(){}

    public Circle(double theR){
        r = theR;
    }

    public double area(){
        return r*r*Math.PI;
    }
}
