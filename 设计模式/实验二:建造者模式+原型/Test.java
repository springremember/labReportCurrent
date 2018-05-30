public class Test {
    public static void main(String[] args) {
        Builder test = new ConcreteBuilder();
        Director hmc = new Director(test);

        IBM spring = hmc.getIBM();
        System.out.println("");
        spring.display();

        System.out.println("");

        System.out.println("以下测试原型方法。");
        IBM spring2 = spring.clone();
        spring2.setMonitor("hello");

        System.out.println("");

        System.out.println("以下查看旧的对象是否改变。");
        spring.display();
    }
}
