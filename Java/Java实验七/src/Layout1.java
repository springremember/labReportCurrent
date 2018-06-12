import javax.swing.*;
import java.awt.*;

public class Layout1 {
    public static void main(String[] args){
        MyJFrame myJFrame = new MyJFrame("我的窗口",100,100,300,100);
        myJFrame.setLayout(new FlowLayout());
        JButton button1 = new JButton("北");
        myJFrame.add(button1);
        JButton button2 = new JButton("东");
        myJFrame.add(button2);
        JButton button3 = new JButton("西");
        myJFrame.add(button3);
        JButton button4 = new JButton("南");
        myJFrame.add(button4);
        JButton button5 = new JButton("中");
        myJFrame.add(button5);
        myJFrame.pack();
        myJFrame.setVisible(true);
    }
}


