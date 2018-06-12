public class Test {
    public static void main(String[] args) {
        Geometry[] hmc = {new Square(6.6),new Geometry(){
            private double r = 9.9;

            @Override
            public double getPerimeter() {
                return Math.PI * 2 * r;
            }

            @Override
            public double getArea() {
                return Math.PI*r*r;
            }
        }};

        System.out.println("第一个对象面积："+hmc[0].getArea());
        System.out.println("第一个对象面积："+hmc[0].getPerimeter());
        System.out.println("第二个对象面积："+hmc[1].getArea());
        System.out.println("第二个对象面积："+hmc[1].getPerimeter());
    }
}
