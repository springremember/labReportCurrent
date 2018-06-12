public class Test{
    public static void main(String[] args) {
        Figure test = new Circle(4.56);
        System.out.println("圆形的面积为"+testA.area());

        System.out.println("");

        test = new Square(7.3);
        System.out.println("正方形的面积为"+test.area());

        System.out.println("");

        test = new Triangle(12.3,31.1,25.3);
        System.out.println("三角形的面积为"+test.area());
    }
}
