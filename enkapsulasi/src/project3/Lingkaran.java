/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3;

/**
 *
 * @author User
 */
public class Lingkaran {
    private double diameter;

    Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    // setter
    public void setJari2(double jari2) {
        this.diameter = jari2 * 2;
    }

    // getter
    public double getJari2() {
        return this.diameter / 2;
    }
    
    // getter
    public double getLuas() {
        return 3.14 * diameter * diameter / 4;
    }
}
