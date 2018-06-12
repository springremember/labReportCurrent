public class Adapter2 implements Ps2 {
    public Usb from;

    public Adapter2(){}

    public Adapter2(Usb from){
        this.from = from;
    }

    public void isPs2(){
        System.out.println("适配前：");
        from.isUsb();
        System.out.println("适配后：");
        System.out.println("适配后的为USB接口");
    }

}
