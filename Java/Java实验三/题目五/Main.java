public class Main {
    public static void main(String[] args) {
        Cone hmc = new Cone(5,4);
        System.out.println("圆锥的体积："+hmc.calculate());
    }
}

class Circle {
    private double r;

    public Circle(){}

    public Circle(double r){
        this.r = r;
    }

    public double calculate(){
        return Math.PI*r*r;
    }
}

class Cone {
    private Circle cc;
    private double h;

    public Cone(){}

    public Cone(double r,double h){
        cc = new Circle(r);
        this.h = h;
    }

    public Cone(Circle hmc,double h){
        cc = hmc;
        this.h = h;
    }
    
    public double calculate(){
        double s = cc.calculate();
        double v = 1.0/3 * s * h;
        return v;
    }
}
