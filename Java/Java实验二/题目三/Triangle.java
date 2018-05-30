import java.math.*;
public class Triangle extends Figure {
    double a;
    double b;
    double c;

    public Triangle(){}

    public Triangle(double tempA,double tempB,double tempC){
        a = tempA;
        b = tempB;
        c = tempC;
    }

    public double area(){
        double p = a + b + c;
        p = p/2;
        double s = p*(p-a)*(p-b)*(p-c);
        s = Math.sqrt(s);
        return s;
    }
}
