/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3.SingeltonDP;

/**
 *
 * @author Hp
 */
public class Connection {
    
    private static Connection instance = null;
    private static int cnx = 0;
    
    private Connection(){
        cnx++;
    }
    
    public static Connection getInstance(){
        if(instance==null){
            instance=new Connection();
        }
        return instance;
    }
    
    public void getConnection(){
        System.out.println("Connection number : "+cnx);
    }
    
}
