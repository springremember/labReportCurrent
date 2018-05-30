/*
 * ViewPanel.java
 
 */

package com.view;

import com.model.CircleModel;
import com.util.ObserverInterface;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
/**
 *
 
 */
public class ViewPanel extends JPanel implements ObserverInterface{
    private CircleModel model;
    /** Creates a new instance of ViewPanel */
    public ViewPanel() {
    }
    public ViewPanel(CircleModel model){
        this.setModel(model);
        vpInit();
    }
    
    private void vpInit(){
        this.setBackground(Color.white);
        this.setBorder(new TitledBorder(BorderFactory.createLineBorder(Color.blue,1),"ÊÓÍ¼Çø"));
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(getModel()==null)
            return;
        double r = getModel().getRadii();
        int w = this.getWidth();
        int h = this.getHeight();
        int x = (int)Math.round(r);
        g.drawOval(w/2-x,h/2-x,x+x,x+x);
    }
    
    public void dataUpdate(CircleModel cm) {
        this.setModel(getModel());
        repaint();
    }

    public CircleModel getModel() {
        return model;
    }

    public void setModel(CircleModel model) {
        this.model = model;
    }
    
}
