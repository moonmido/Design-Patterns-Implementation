/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3.CompositeDP;

/**
 *
 * @author Hp
 */
public class Leaf implements Component{

     String name;
     double price;

    public Leaf(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }
    
    
    @Override
    public void showPrice() {
           System.out.println("name : "+this.name+" price : "+this.price);
    }
    
    
}
