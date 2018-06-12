import javax.swing.*;
import static javax.swing.JFrame.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.text.*;

class MyJFrame extends JFrame{
	MyJFrame(String s,int x,int y,int w,int h){
		setLayout(new FlowLayout());
		setTitle(s);
		setBounds(x,y,w,h);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

class CalculateHandler implements ActionListener {
	JTextArea first;
	JTextArea second;
	JComboBox op;
	JTextArea show;

	public void setJTextArea(JTextArea first, JTextArea second,JTextArea show){
		this.first = first;
		this.second = second;
		this.show = show;
	}

	public void setJComBox(JComboBox op){
		this.op = op;
	}

	public void actionPerformed(ActionEvent e) {
		NumberFormat nbf=NumberFormat.getInstance();
		nbf.setMinimumFractionDigits(2);

		double firstNumber = 0;
		double secondNumber = 0;
		int flag = 0;
		try {
			firstNumber = Double.parseDouble(first.getText());
			secondNumber = Double.parseDouble(second.getText());
		} catch(Exception error) {
			show.append("输入错误\n");
			flag = 1;
		}

		double answer = 0;
		String choose = (String)op.getSelectedItem();
		if (flag == 0) {
			try {
				if (choose == "+") {
					answer = firstNumber + secondNumber;
				}
				else if (choose == "-") {
					answer = firstNumber - secondNumber;
				}
				else if (choose == "*") {
					answer = firstNumber * secondNumber;
				}
				else if (choose == "/") {
					answer = firstNumber / secondNumber;
				}
				show.append(nbf.format(firstNumber)+" "+(String)op.getSelectedItem()+"   "+nbf.format(secondNumber)+" = "+nbf.format(answer)+"\n");
			} catch(Exception error) {
				show.append("发生错误");
			}
		}


	}
}

public class Test {
	public static void main(String[] args) {
		JFrame hmc = new MyJFrame("简单计算器", 400, 400, 600, 600);

		hmc.setLayout(new FlowLayout());

		Box firstLine = Box.createHorizontalBox();

		JTextArea first = new JTextArea(2,10);
		// hmc.add(new JScrollPane(first));
		// hmc.add(first);

		String[] op = {"+","-","*","/"};
		JComboBox opBox = new JComboBox<>(op);
		opBox.setPreferredSize(new Dimension(150, 30));
		// hmc.add(opBox);

		JTextArea second = new JTextArea(2,10);
		// hmc.add(new JScrollPane(first));
		// hmc.add(second);

		JButton calculate = new JButton("计算");
		// hmc.add(calculate);

		firstLine.add(Box.createHorizontalStrut(10));
		firstLine.add(first);
		firstLine.add(Box.createHorizontalStrut(10));
		firstLine.add(opBox);
		firstLine.add(Box.createHorizontalStrut(10));
		firstLine.add(second);
		firstLine.add(Box.createHorizontalStrut(10));
		firstLine.add(calculate);
		firstLine.add(Box.createHorizontalStrut(10));

		Box secondLine = Box.createHorizontalBox();

		JTextArea answer = new JTextArea(20,20);
		// hmc.add(answer);

		secondLine.add(Box.createHorizontalStrut(10));
		secondLine.add(answer);
		secondLine.add(Box.createHorizontalStrut(10));

		Box whole = Box.createVerticalBox();
		whole.add(Box.createVerticalStrut(10));
		whole.add(firstLine);
		whole.add(Box.createVerticalStrut(20));
		whole.add(secondLine);
		whole.add(Box.createVerticalStrut(20));

		hmc.add(whole);

		//事件
		CalculateHandler listener = new CalculateHandler();
		listener.setJTextArea(first, second, answer);
		listener.setJComBox(opBox);
		calculate.addActionListener(listener);

		hmc.pack();

		hmc.setVisible(true);
	}
}
