/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project2_classs_method;

/**
 *
 * @author User
 */
public class game_main_class {

    public static void main(String[] args) {
        Player petani = new Player ();
        
        petani.name = "petsni kode";
        petani.speed = 78;
        petani.healthpoin = 100;
        
        petani.run();
        
        if (petani.isDead()){
            System.out.println("Game Over!");
        }

    }
    
}
