public class AutoDecorator  extends Decorator{
    public AutoDecorator(){};

    public AutoDecorator(Car in){
        hmc = in;
    }

    public void dotheThing(){
        hmc.dotheThing();
        System.out.print("+自动驾驶");
    }
}
