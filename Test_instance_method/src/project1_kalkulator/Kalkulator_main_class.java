/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1_kalkulator;
public class Kalkulator_main_class {
    public static void main(String[] args) {
        Kalkulator k  = new Kalkulator();

        System.out.println("10 + 5 = " + k.tambah(0,4, 5));
        System.out.println("10 - 5 = " + k.kurang(10, 5));
        System.out.println("10 x 5 = " + k.kali(10, 5));
        System.out.println("10 / 4 = " + k.bagi(10, 4));
    }
    
}
