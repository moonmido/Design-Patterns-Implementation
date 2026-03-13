/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3.CompositeDP;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class Composite implements Component{
    
    String name;
    private List<Component> comps = new ArrayList<>();

    public Composite(String n) {
        super();
    this.name = n;
    }
    
    
    public void addComponent(Component com){
       comps.add(com);
    }
    
    @Override
    public void showPrice() {
        System.out.println("name : "+name);
        for(Component c : comps){
            c.showPrice();
        }
    }
    
}
