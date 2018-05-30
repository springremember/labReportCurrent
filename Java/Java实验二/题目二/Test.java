public class Test{
    public static void main(String[] args) {
        Figure test = new Circle(4.56);
        System.out.println("圆形的面积为"+test.area());

        System.out.println("");

        test = new Square(7.3);
        System.out.println("正方形的面积为"+test.area());
    }
}
