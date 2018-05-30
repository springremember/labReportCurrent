/*
 * ControlSlider.java
 */

package com.view;

import com.controller.Controller;
import com.util.ObserverInterface;
import java.text.DecimalFormat;
import javax.swing.JSlider;
import javax.swing.JTextField;
import com.model.CircleModel;
/**
 *
 
 */
public class ControlSlider extends JSlider implements ObserverInterface{
    private CircleModel circleModel;
    /** Creates a new instance of ControlSlider */
    public ControlSlider() {
    }
    
    public ControlSlider(CircleModel circleModel){
        super(0,Controller.MAXRADII,(int)circleModel.getRadii());
        this.circleModel = circleModel;
    }
    
    public void dataUpdate(CircleModel circleModel) {
        setCircleModel(circleModel);
        setValue((int)Math.round(circleModel.getRadii()));
    }    

    public CircleModel getCircleModel() {
        return circleModel;
    }

    public void setCircleModel(CircleModel circleModel) {
        this.circleModel = circleModel;
    }
}
