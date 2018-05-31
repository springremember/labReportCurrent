import javax.smartcardio.Card;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout5 {
    public static void main(String[] args){
        MyJFrame myJFrame = new MyJFrame("我的窗口",100,100,500,500);

        JPanel panel1 = new JPanel();
        CardLayout card = new CardLayout();
        panel1.setLayout(card);
        panel1.setBackground(Color.yellow);

        JPanel panel2 = new JPanel();
        myJFrame.add(panel1,BorderLayout.CENTER);
        myJFrame.add(panel2,BorderLayout.SOUTH);

        String[] names = {"第一张","第二张","第三张","第四张","第五张"};
        JLabel label;
        for (int i = 0;i<names.length;i++){
            label = new JLabel(names[i],SwingConstants.CENTER);
            label.setFont(new Font("宋体",Font.PLAIN,28));
            panel1.add(names[i],label);
        }
        JButton button1 = new JButton("上一张");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.previous(panel1);
            }
        });
        JButton button2 = new JButton("下一张");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.next(panel1);
            }
        });
        JButton button3 = new JButton("第一张");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.first(panel1);
            }
        });
        JButton button4 = new JButton("最后一张");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.last(panel1);
            }
        });
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);

        myJFrame.setVisible(true);
    }
}
