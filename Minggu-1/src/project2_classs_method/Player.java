/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2_classs_method;

/**
 *
 * @author User
 */
public class Player {
    String name;
    int speed;
    int healthpoin;
    
    // definisi method run
    void run(){
        System.out.println(name +" is running..." );
        System.out.println("speed: "+ speed);
    }
    // definidi method isdead untuk mengecek nilai
    boolean isDead(){
        if (healthpoin <= 0) return true;
        return false;
    } 
}
