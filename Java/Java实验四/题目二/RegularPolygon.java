public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int n,double side){
        this.n = n;
        this.side = side;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int n,double side,double x,double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public double getPerimeter(){
        return n * side;
    }

    public double getArea(){
        double temp = n * side * side;
        temp = temp / (4 * Math.tan(Math.PI / n));
        return temp;
    }
}

class Test {
    public static void show(RegularPolygon spring){
        System.out.println("周长:"+spring.getPerimeter());
        System.out.println("面积:"+spring.getArea());
    }

    public static void main(String[] args) {
        RegularPolygon hmc1 = new RegularPolygon();
        RegularPolygon hmc2 = new RegularPolygon(6,4);
        RegularPolygon hmc3 = new RegularPolygon(10,4,5.6,7.8);

        show(hmc1);
        show(hmc2);
        show(hmc3);
    }
}
