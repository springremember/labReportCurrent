public class NavigationDecorator extends Decorator {
    public NavigationDecorator(){}

    public NavigationDecorator(Car in){
        hmc = in;
    }

    public void dotheThing(){
        hmc.dotheThing();
        System.out.print("+导航");
    }
}
