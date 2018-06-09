import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackSpaceAction implements ActionListener {
    Display display;

    BackSpaceAction(Display display){
        this.display = display;
    }

    BackSpaceAction(){}

    @Override
    public void actionPerformed(ActionEvent e) {
        display.backSpace();
    }
}
