public class Rectangle extends Shape{
    double a;
    double b;

    public Rectangle(){}

    public Rectangle(String aColor,double theA,double theB){
        super(aColor);
        a = theA;
        b = theB;
    }

    public void show(){
        System.out.println("颜色为"+color);
        System.out.println("长为"+a);
        System.out.println("宽为"+b);
    }
}
