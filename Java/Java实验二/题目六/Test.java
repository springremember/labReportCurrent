public class Test{
    public static void main(String[] args) {
        Shape[] spring = new Shape[3];

        spring[0] = new Circle(4.56);
        spring[1] = new Square(7.3);
        spring[2] = new Triangle(12.3,31.1,25.3);

        System.out.println("圆形的面积为"+spring[0].area());

        System.out.println("");

        System.out.println("正方形的面积为"+spring[1].area());

        System.out.println("");

        System.out.println("三角形的面积为"+spring[2].area());
    }
}
