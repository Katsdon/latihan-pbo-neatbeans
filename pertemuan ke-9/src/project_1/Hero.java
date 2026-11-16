/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_1;

/**
 *
 * @author User
 */
public abstract class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Mata kuliah prodi sistem informasi " + this.name);
    }
}


