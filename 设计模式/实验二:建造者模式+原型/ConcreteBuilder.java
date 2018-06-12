import java.util.*;

public class ConcreteBuilder extends Builder {
    public void buildCPU(){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入选配的CPU型号：");
        CPU = in.nextLine();
    }

    public void buildRAM(){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入选配的内存：");
        RAM = in.nextLine();
    }

    public void getMB(){
        MB = new MotherBoard(CPU,RAM);
    }

    public void buildMonitor(){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入选配的显示器：");
        monitor= in.nextLine();
    }

    public void buildKeyboard(){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入选配的键盘：");
        keyBoard = in.nextLine();
    }

    public void buildMouse(){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入选配的鼠标：");
        mouse = in.nextLine();
        in.close();
    }

}
