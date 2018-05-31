import javax.swing.*;
import java.awt.*;

public class Layout2 {
    public static void main(String[] args) {
        MyJFrame myJFrame = new MyJFrame("我的窗口", 100, 100, 300, 300);
        myJFrame.setLayout(new BorderLayout());
        JButton button1 = new JButton("东");
        JButton button2 = new JButton("南");
        JButton button3 = new JButton("西");
        JButton button4 = new JButton("北");
        JButton button5 = new JButton("中");

        myJFrame.add(button1,BorderLayout.EAST);
        myJFrame.add(button2,BorderLayout.SOUTH);
        myJFrame.add(button3,BorderLayout.WEST);
        myJFrame.add(button4,BorderLayout.NORTH);
        myJFrame.add(button5,BorderLayout.CENTER);
        myJFrame.pack();
        myJFrame.setVisible(true);
    }
}


