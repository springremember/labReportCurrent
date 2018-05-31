import javax.swing.*;

class MyJFrame extends JFrame {
    MyJFrame(String s,int x,int y,int w,int h){
        setTitle(s);
        setBounds(x,y,w,h);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
