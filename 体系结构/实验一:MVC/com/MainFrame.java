/*
 * MainFrame.java

 */

package com;

import com.controller.Controller;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.*;
import javax.swing.*;
import com.view.*;
import com.model.CircleModel;

public class MainFrame extends JFrame{
    public CircleModel model;
    public ViewPanel vp;
    public RTextField rTextField;
    public CTextField cTextField;
    public STextField sTextField;
    public ControlSlider slider;
    public BTextField bTextField;
    public R2TextField r2TextField;
    private JPanel topPanel = new JPanel();
    private JPanel bottomPanel = new JPanel();
    public JButton jButton1 = new JButton("????");
    private JLabel jLabel1 = new JLabel("??");
    private JLabel jLabel2 = new JLabel("???");
    private JLabel jLabel3 = new JLabel("????");
    private JLabel jLabel4 = new JLabel("??????");
    private JLabel jLabel5 = new JLabel("直径");

    /** Creates a new instance of MainFrame */
    public MainFrame(String title) {
        super.setTitle(title);
        initComponent();
        new Controller(this);
    }

    private void initComponent(){
        model=new CircleModel(10.0);
        vp = new ViewPanel(model);
        rTextField = new RTextField(model);
        cTextField = new CTextField(model);
        sTextField = new STextField(model);
        bTextField = new BTextField(model);
        r2TextField = new R2TextField(model);
        slider = new ControlSlider(model);
        cTextField.setEditable(false);
        sTextField.setEditable(false);
        bTextField.setEditable(false);
        r2TextField.setEditable(false);
        topPanel.setLayout(new FlowLayout());
        topPanel.add(jLabel1);
        topPanel.add(rTextField);
        topPanel.add(jButton1);
        slider.setValue(10);
        topPanel.add(slider);
        bottomPanel.setLayout(new FlowLayout());
        bottomPanel.add(jLabel2);
        bottomPanel.add(cTextField);
        bottomPanel.add(jLabel3);
        bottomPanel.add(sTextField);
        bottomPanel.add(jLabel4);
        bottomPanel.add(bTextField);
        bottomPanel.add(jLabel5);
        bottomPanel.add(r2TextField);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(topPanel,BorderLayout.NORTH);
        this.getContentPane().add(vp,BorderLayout.CENTER);
        this.getContentPane().add(bottomPanel,BorderLayout.SOUTH);
        this.setSize(640,480);
        this.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e) {
            System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        // TODO code application logic here
        MainFrame mf = new MainFrame("MVC??? ");
        mf.setVisible(true);
    }
}
