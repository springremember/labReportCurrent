import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CAndCEAction implements ActionListener {
    Display display;

    CAndCEAction(){}

    CAndCEAction(Display display){
        this.display = display;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        display.CAndCE();
    }
}
