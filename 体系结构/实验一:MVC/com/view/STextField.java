/*
 * STextField.java
 *
 
 */

package com.view;
import com.util.ObserverInterface;
import java.text.DecimalFormat;
import javax.swing.JTextField;
import com.model.CircleModel;
/**
 *
 
 */
public class STextField extends JTextField implements ObserverInterface{
    private CircleModel model;
    private DecimalFormat df = new DecimalFormat("#####0.00");
    /** Creates a new instance of RTextField */
    public STextField() {
    }
    
    public STextField(CircleModel model){
        super(10);
        this.model = model;
        this.update();
    }

    public void dataUpdate(CircleModel cm) {
        this.setModel(getModel());
        update();
    }
    
    private void update(){
        this.setText(df.format(model.computeSuperficial()));
    }
    
    public CircleModel getModel() {
        return model;
    }

    public void setModel(CircleModel model) {
        this.model = model;
    }
    
}