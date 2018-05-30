/*
 * Controller.java
 
 */

package com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import com.MainFrame;
import com.view.ViewPanel;
import com.model.CircleModel;


/**
 *
 
 */
public class Controller implements ActionListener,ChangeListener{
    public static final int MAXRADII = 500;
    private MainFrame mf;
    private CircleModel model;
    /** Creates a new instance of Controller */
    public Controller() {
    }
    
    public Controller(MainFrame mf){
        this.mf = mf;
        model = mf.model;
        //??????
        model.registerObserver(mf.vp);
        model.registerObserver(mf.rTextField);
        model.registerObserver(mf.cTextField);
        model.registerObserver(mf.sTextField);
        model.registerObserver(mf.bTextField);
        model.registerObserver(mf.slider);
        model.registerObserver(mf.r2TextField);
        mf.jButton1.addActionListener(this);
        mf.slider.addChangeListener(this);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource().equals(mf.jButton1)){
            try{
                double r = Double.parseDouble(mf.rTextField.getText());
                if(r>=0.0&&r<=MAXRADII){
                    mf.slider.removeChangeListener(this);//???????????????????????????¡¤???????
                    model.changeRadii(r);
                    mf.slider.addChangeListener(this);
                }
                else
                    showMessageDialog("????????????0.0-"+MAXRADII+".0");
            }catch(Exception err){
                showMessageDialog("????????????0.0-"+MAXRADII+".0");        
            }
        }
    }

    public void stateChanged(ChangeEvent changeEvent) {
        double r = (double)mf.slider.getValue();
        model.changeRadii(r);
    }
    
    public void showMessageDialog(String str){
        JOptionPane.showMessageDialog(mf,str,"???",JOptionPane.INFORMATION_MESSAGE);
    }
}
