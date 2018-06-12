import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    Box baseBox = Box.createVerticalBox();

    public Display display = new Display();

    public JButton backSpace = new JButton("BackSpace");
    public JButton CE = new JButton("CE");
    public JButton C = new JButton("C");

    public JButton num1 = new JButton("1");
    public JButton num2 = new JButton("2");
    public JButton num3 = new JButton("3");
    public JButton num4 = new JButton("4");
    public JButton num5 = new JButton("5");
    public JButton num6 = new JButton("6");
    public JButton num7 = new JButton("7");
    public JButton num8 = new JButton("8");
    public JButton num9 = new JButton("9");
    public JButton num0 = new JButton("0");

    public JButton add = new JButton("+");
    public JButton sub = new JButton("-");
    public JButton mul = new JButton("*");
    public JButton div = new JButton("/");

    public JButton or = new JButton("+/-");
    public JButton point = new JButton(".");

    public JButton sqrt = new JButton("sqrt");
    public JButton mod = new JButton("%");
    public JButton div1 = new JButton("1/x");

    public JButton cal = new JButton("=");

    // 构造函数
    MyFrame(){
        setTitle("计算器");
        setBounds(200,200,450,200);
        setLayout(new FlowLayout());
        initFirst();
        initSecond();
        initRest();
        BondAction();
        this.add(baseBox);
        this.pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // 初始化第一行
    private void initFirst(){
        display.setPreferredSize(new Dimension(450,50));
        baseBox.add(display);
    }

    // 初始化第二行
    private void initSecond(){
        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(450,50));
        panel2.setLayout(new GridLayout(1,3));
        panel2.add(backSpace);
        panel2.add(CE);
        panel2.add(C);
        baseBox.add(panel2);
    }

    // 初始化剩下的部分
    private void initRest(){
        JPanel panel3 = new JPanel();
        panel3.setPreferredSize(new Dimension(450,160));
        panel3.setLayout(new GridLayout(4,5));
        panel3.add(num7);
        panel3.add(num8);
        panel3.add(num9);
        panel3.add(div);
        panel3.add(sqrt);

        panel3.add(num4);
        panel3.add(num5);
        panel3.add(num6);
        panel3.add(mul);
        panel3.add(mod);

        panel3.add(num1);
        panel3.add(num2);
        panel3.add(num3);
        panel3.add(sub);
        panel3.add(div1);

        panel3.add(num0);
        panel3.add(or);
        panel3.add(point);
        panel3.add(add);
        panel3.add(cal);

        baseBox.add(panel3);
    }

    // 绑定事件函数
    public void BondAction(){
        num0.addActionListener(TailAddAction.getTailAddAction(display));
        num1.addActionListener(TailAddAction.getTailAddAction(display));
        num2.addActionListener(TailAddAction.getTailAddAction(display));
        num3.addActionListener(TailAddAction.getTailAddAction(display));
        num4.addActionListener(TailAddAction.getTailAddAction(display));
        num5.addActionListener(TailAddAction.getTailAddAction(display));
        num6.addActionListener(TailAddAction.getTailAddAction(display));
        num7.addActionListener(TailAddAction.getTailAddAction(display));
        num8.addActionListener(TailAddAction.getTailAddAction(display));
        num9.addActionListener(TailAddAction.getTailAddAction(display));
        add.addActionListener(TailAddAction.getTailAddAction(display));
        sub.addActionListener(TailAddAction.getTailAddAction(display));
        mul.addActionListener(TailAddAction.getTailAddAction(display));
        div.addActionListener(TailAddAction.getTailAddAction(display));
        point.addActionListener(TailAddAction.getTailAddAction(display));
        mod.addActionListener(TailAddAction.getTailAddAction(display));

        div1.addActionListener(HeadAddAction.getHeadAddAction(display));
        or.addActionListener(HeadAddAction.getHeadAddAction(display));
        sqrt.addActionListener(HeadAddAction.getHeadAddAction(display));

        BackSpaceAction backSpaceAction = new BackSpaceAction(display);
        backSpace.addActionListener(backSpaceAction);

        CAndCEAction clear = new CAndCEAction(display);
        C.addActionListener(clear);
        CE.addActionListener(clear);

        CalculateAction calculateAction = new CalculateAction(display);
        cal.addActionListener(calculateAction);
    }
}
