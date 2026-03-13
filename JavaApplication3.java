/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import javaapplication3.ObserverDP.Channel;
import javaapplication3.ObserverDP.Subscriber;
import javaapplication3.SingeltonDP.Connection;
import javaapplication3.CompositeDP.Composite;
import javaapplication3.CompositeDP.Leaf;
import javaapplication3.CompositeDP.Component;

/**
 *
 * @author Hp
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //COMPOSITE
          System.out.println("--------COMPOSITE DESIGN PATTERN -----------------");


        Component Ram = new Leaf("trident z",2000);
        Component Ssd = new Leaf("samsung T5 250GB",35000);
        Component gpu = new Leaf("Nvidia 5090 Ti",785000);
        
        Composite mb = new Composite("Mother Board");
        
        mb.addComponent(Ram);
        mb.addComponent(Ssd);
        mb.addComponent(gpu);
        
        
        Ram.showPrice();
        Ssd.showPrice();
        gpu.showPrice();
        
        mb.showPrice();


//SINGELTON
  System.out.println("--------SINGELTON DESIGN PATTERN -----------------");

        Connection cnx1 = Connection.getInstance();
        Connection cnx2 = Connection.getInstance();
        
            cnx1.getConnection();
            cnx2.getConnection();
            
            
           
  // OBSERVER
  
  System.out.println("--------OBSERVER DESIGN PATTERN -----------------");
  
  Channel c1 = new Channel("KSI");

        Subscriber s1 = new Subscriber("mido");
        Subscriber s2 = new Subscriber("abdou");
        Subscriber s3 = new Subscriber("karim");

        c1.subscribe(s1);
        c1.subscribe(s2);
        c1.subscribe(s3);

        c1.uploadVideo("How To Be Like LINUS !!");
            
    }
    
 
    
}
