import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args){
        // 初始化框架
        MyJFrame myJFrame = new MyJFrame("客户端",200,200,400,300);
        // 设置布局
        myJFrame.setAll();
        // 设置事件
        myJFrame.setEvent();
        // 绘出图形
        myJFrame.setVisible(true);
    }
}

class MyJFrame extends JFrame {
    // 组件
    JLabel label1 = new JLabel("用户名");
    JLabel label2 = new JLabel("密码");
    JTextField nameField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton submitButton = new JButton("查询成绩");
    JButton clearButtom = new JButton("重置");

    MyJFrame(String s,int x,int y,int w,int h){
        setTitle(s);
        setBounds(x,y,w,h);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // 使用箱子设置布局
    public void setAll(){
        Box baseBox = Box.createVerticalBox();
        Box box1 = Box.createHorizontalBox();
        Box box2 = Box.createHorizontalBox();
        Box box3 = Box.createHorizontalBox();

        // 第一行
        box1.add(label1);
        box1.add(Box.createHorizontalStrut(20));
        box1.add(nameField);

        // 第二行
        box2.add(label2);
        box2.add(Box.createHorizontalStrut(20));
        box2.add(passwordField);

        // 第三行
        box3.add(submitButton);
        box3.add(Box.createHorizontalStrut(20));
        box3.add(clearButtom);

        // 总箱子设置
        baseBox.add(Box.createVerticalStrut(100));
        baseBox.add(box1);
        baseBox.add(Box.createVerticalStrut(10));
        baseBox.add(box2);
        baseBox.add(Box.createVerticalStrut(60));
        baseBox.add(box3);

        this.add(baseBox);
    }

    public void setEvent(){
        ActionListener submit = new SubmitEvent(this,nameField,passwordField);
        submitButton.addActionListener(submit);
        ActionListener clear = new ClearEvent(nameField,passwordField);
        clearButtom.addActionListener(clear);
    }

}

// 提交事件
class SubmitEvent implements ActionListener {
    JFrame father;
    JTextField nameField;
    JPasswordField passwordField;

    SubmitEvent(JFrame father, JTextField nameField, JPasswordField passwordField){
        this.father = father;
        this.nameField = nameField;
        this.passwordField = passwordField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();//得到用户名
        String password = new String(passwordField.getPassword());//得到密码
        InetAddress ip;
        int port = 2333;//服务器端口
        try {
            ip = InetAddress.getByName("127.0.0.1");//服务器ip
            Socket socket = new Socket(ip,port);
            DataInputStream in = new DataInputStream(socket.getInputStream());//输入流
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());//输出流
            out.writeUTF(name);//传输用户名
            out.writeUTF(password);//传输密码
            String result = in.readUTF();//得到结果
            JOptionPane.showMessageDialog(father,result,"结果",JOptionPane.INFORMATION_MESSAGE);//输出结果
        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(father,ex.getMessage(),"出错",JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(father,ex.getMessage(),"出错",JOptionPane.ERROR_MESSAGE);
        }
    }
}

// 重置事件
class ClearEvent implements ActionListener{
    JTextField nameField;
    JPasswordField passwordField;

    ClearEvent(JTextField nameField,JPasswordField passwordField){
        this.nameField = nameField;
        this.passwordField = passwordField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        nameField.setText("");
        passwordField.setText("");
    }
}
