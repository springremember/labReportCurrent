import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TailAddAction implements ActionListener {
    private static TailAddAction single = null;

    private TailAddAction(){}

    private TailAddAction(Display display){
        this.display = display;
    }

    public static TailAddAction getTailAddAction(Display display){
        if (single == null){
            single = new TailAddAction(display);
        }
        return single;
    }

    public Display display;

    @Override
    public void actionPerformed(ActionEvent e) {
        String num = e.getActionCommand();
        display.tailAdd(num);
    }
}
