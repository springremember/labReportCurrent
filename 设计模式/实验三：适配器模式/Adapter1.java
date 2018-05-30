public class Adapter1 extends Usb implements Ps2 {

    public void isPs2(){
        System.out.println("转化前接口");
        super.isUsb();
        System.out.println("转化后");
        System.out.println("适配为Ps2接口模式");
    }
}
