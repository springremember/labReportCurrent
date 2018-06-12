import javax.swing.*;

public class Display extends JTextField {
    Display(){
    }

    public void tailAdd(String num){
        String current = getText();
        current = current + num;
        setText(current);
    }

    public void headAdd(String op){
        String current = getText();
        current = op + "(" + current + ")";
        setText(current);
    }

    public void or(){
        String curret = getText();
        char op = curret.charAt(0);
        if (op == '-'){
            curret = curret.substring(1);
        }
        else {
            curret = "-" + curret;
        }
        setText(curret);
    }

    public void backSpace(){
        String current = getText();
        if (current.length() != 0) {
            current = current.substring(0, current.length() - 1);
        }
        setText(current);
    }

    public void CAndCE(){
        setText("");
    }
}
