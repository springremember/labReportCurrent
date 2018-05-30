/*
 * CircleModel.java
 *
 
 * ???????
 
 */

package com.model;

import java.util.ArrayList;
import java.util.Iterator;
import com.util.ObserverInterface;

public class CircleModel {
    private double radii = 10.0;//??
    private ArrayList observer = new ArrayList();//??????§Ò?
    /** Creates a new instance of CircleModel */
    public CircleModel() {
        super();
    }
    public CircleModel(double radii){
        setRadii(radii);
    }

    public double getRadii() {
        return radii;
    }

    public void setRadii(double radii) {
        this.radii = radii;
    }
    
    /**
     * ???????
     */
    public double computeGirth(){
        return (radii*Math.PI*2.0);
    }
    
    /**
     * ???????
     */
    public double computeSuperficial(){
        return (radii*radii*Math.PI);
    }
    
    public double computeBallSuperficial(){
        return (radii*radii*4*Math.PI);
    }
    
    // ???
    public double computeR2(){
        return (radii*2);
    }
    /**
     * ??????§Ö??????
     */
    public void registerObserver(ObserverInterface o){
        observer.add(o);
    }
    
    public void removeObserver(ObserverInterface o){
        observer.remove(o);
    }
    
    /**
     * ?????????????????????????????????????????
     */
    public void changeRadii(double r){
        setRadii(r);
        dataUpdate();
    }

    private void dataUpdate() {
        for(Iterator i = observer.iterator(); i.hasNext();){
            ObserverInterface o = (ObserverInterface)(i.next());
            o.dataUpdate(this);
        }
    }
}
