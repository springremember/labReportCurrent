public class Test{
    public static void main(String[] args) {
        Car spring = new AutoDecorator(new NavigationDecorator(new FengTian()));
        spring.dotheThing();
        System.out.println("");
    }
}
