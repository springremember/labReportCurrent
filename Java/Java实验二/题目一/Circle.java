public class Circle extends Shape {
    double r;

    public Circle(){}

    public Circle(String aColor,double aR){
        super(aColor);
        r = aR;
    }

    public void show(){
        System.out.println("颜色为"+color);
        System.out.println("半径为"+r);
    }
}
