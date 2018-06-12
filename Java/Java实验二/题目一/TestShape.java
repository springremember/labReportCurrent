public class TestShape {
    public static void main(String[] args) {
        Circle test = new Circle("蓝色",5.23);
        test.show();

        System.out.println("");

        test = new Rectangle("红色",7.8,3);
        test.show();
    }
}
