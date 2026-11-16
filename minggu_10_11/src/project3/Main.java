/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project3;

public class Main {

    public static void main(String[] args) {
        double jariJari = 7.0;
        double hasil = Kalkulator.hitungLuasLinkaran(jariJari);

        System.out.println("Jari-jari lingkaran: " + jariJari);
        System.out.println("Hasil Luas Lingkaran: " + hasil);

        Kalkulator kal = new Kalkulator();
        kal.info();
    }
}
