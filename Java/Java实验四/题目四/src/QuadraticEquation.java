package src;
import java.util.*;
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public double getDiscriminant(){
        return b * b - 4 * a * c;
    }

    public double getRoot1(){
        double temp = b * b - 4 * a * c;
        if (temp >= 0 ) {
            temp = Math.sqrt(temp);
            temp = temp - b;
            return temp / (2 * a);
        }
        else {
            return 0;
        }
    }

    public double getRoot2(){
        double temp = b * b - 4 * a * c;
        if (temp >= 0) {
            temp = Math.sqrt(temp);
            temp = (- b) - temp;
            return temp / (2 * a);
        }
        else {
            return 0;
        }
    }
}
