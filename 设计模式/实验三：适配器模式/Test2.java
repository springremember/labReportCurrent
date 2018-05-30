public class Test2 {
    public static void main(String[] args) {
        Usb hmc = new Usb();
        Ps2 spring = new Adapter2(hmc);
        spring.isPs2();
    }
}
