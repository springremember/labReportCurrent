public class Test {
    public static void main(String[] args) {
        FuShu test1 = new FuShu(12.4,4);
        FuShu test2 = new FuShu(2.1,7.3);

        FuShu sum = test1.add(test2);

        sum.show();
    }
}
