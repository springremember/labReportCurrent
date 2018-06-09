import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateAction implements ActionListener {
    private Display display;

    CalculateAction(){}

    CalculateAction(Display display){
        this.display = display;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");
        String strs = display.getText();
        strs = strs.replace("√","Math.sqrt");
        String answer;
        try{
            answer = jse.eval(strs).toString();
            if (answer == "Infinity"){
                answer = "除数不能为0,请重新输入";
            }
        }
        catch (Exception t){
            answer = "错误的运算";
        }
        display.setText(answer);
    }
}
