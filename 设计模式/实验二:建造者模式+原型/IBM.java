public class IBM implements Cloneable{
    MotherBoard MB;

    String monitor;
    String keyBoard;
    String mouse;

    public IBM(){}

    public IBM(MotherBoard aMB,String aMonitor,String aKeyBoard,String aMouse){
        MB = aMB;
        monitor = aMonitor;
        keyBoard = aKeyBoard;
        mouse = aMouse;
    }

    public IBM clone(){
        System.out.println("电脑克隆方法被调用。");
        MotherBoard tempM = MB.clone();
        return new IBM(tempM,monitor,keyBoard,mouse);
    }

    public void setMonitor(String newMonitor){
        monitor = newMonitor;
    }

    public void display(){
        if (MB != null) {
            MB.show();
        }
        System.out.println("显示器为"+monitor);
        System.out.println("键盘为"+keyBoard);
        System.out.println("鼠标为"+mouse);
    }
}
