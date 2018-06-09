import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HeadAddAction implements ActionListener {
    private static HeadAddAction single = null;

    private HeadAddAction(){}

    private HeadAddAction(Display display){
        this.display = display;
    }

    public static HeadAddAction getHeadAddAction(Display display){
        if (single == null){
            single = new HeadAddAction(display);
        }
        return single;
    }

    public Display display;

    @Override
    public void actionPerformed(ActionEvent e) {
        String type = e.getActionCommand();
        if (type == "sqrt"){
            display.headAdd("√");
        }
        else if (type == "+/-"){
            display.or();
        }
        else {
            display.headAdd("1/");
        }
    }
}
