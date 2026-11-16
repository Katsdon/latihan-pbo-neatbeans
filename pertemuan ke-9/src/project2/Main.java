/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project2;


public class Main {

    
    public static void main(String[] args) {
        BangunDatar Lingkaran = new Lingkaran(7);
        BangunDatar Persegi = new Persegi(4);
        
        Lingkaran.tampilkanInfo();
        System.out.println("Luas Lingkaran" + Lingkaran.hitungLuas());
        
        Persegi.tampilkanInfo();
        System.out.println("Luass Persegi:" + Persegi.hitungLuas());
    }
    
}
