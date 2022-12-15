/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ecommerce.ObserverPattern;

import com.mycompany.ecommerce.view.ViewProductsScreen;

/**
 *
 * @author ram
 */
public interface Subject {
    public abstract void setVisualState(boolean b);
    public abstract boolean getVisualState();
    public void attach(ViewProductsScreen observer);
     public void notifyAllObservers();
}
