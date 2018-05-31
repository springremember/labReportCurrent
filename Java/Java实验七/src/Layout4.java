import javax.swing.*;
import java.awt.*;

public class Layout4 {
    public static void main(String[] args) {
        MyJFrame myJFrame = new MyJFrame("我的窗口",100,100,300,500);
        myJFrame.setLayout(new FlowLayout());

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.setPreferredSize(new Dimension(300,100));
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.ORANGE);
        panel2.setPreferredSize(new Dimension(300,100));
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.yellow);
        panel3.setPreferredSize(new Dimension(300,100));
        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.GREEN);
        panel4.setPreferredSize(new Dimension(300,100));
        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.blue);
        panel5.setPreferredSize(new Dimension(300,100));

        Box baseBox = Box.createVerticalBox();
        baseBox.add(panel1);
        baseBox.add(panel2);
        baseBox.add(panel3);
        baseBox.add(panel4);
        baseBox.add(panel5);

        myJFrame.add(baseBox);
        myJFrame.pack();
        myJFrame.setVisible(true);
    }

}
