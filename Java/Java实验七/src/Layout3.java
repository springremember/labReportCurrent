import javax.swing.*;
import java.awt.*;

public class Layout3 {
    public static void main(String[] args){
        MyJFrame2 myJFrame2 = new MyJFrame2("我的窗口",100,100,300,150);
        myJFrame2.setVisible(true);
    }
}

class MyJFrame2 extends JFrame {
    JMenuBar menuBar;
    JMenu menu1,menu2,submenu;
    JMenuItem item1,item2,item3,item4;

    MyJFrame2(String s,int x,int y,int w,int h){
        setMenu();
        setLayout(new FlowLayout());
        setTitle(s);
        setBounds(x,y,x,h);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    void setMenu(){
        menuBar = new JMenuBar();
        menu1 = new JMenu("File");
        menu2 = new JMenu("Edit");
        item1 = new JMenuItem("open");
        item2 = new JMenuItem("close");
        item3 = new JMenuItem("exit");
        menu1.add(item1);
        menu1.add(item2);
        menu1.addSeparator();
        menu1.add(item3);

        item1 = new JMenuItem("cut");
        item2 = new JMenuItem("copy");
        item3 = new JMenuItem("paste");
        menu2.add(item1);
        menu2.add(item2);
        menu2.add(item3);
        menu2.addSeparator();

        submenu = new JMenu("find and replace");
        item1 = new JMenuItem("find");
        item2 = new JMenuItem("replace");
        submenu.add(item1);
        submenu.add(item2);
        menu2.add(submenu);

        menuBar.add(menu1);
        menuBar.add(menu2);
        setJMenuBar(menuBar);
    }
}