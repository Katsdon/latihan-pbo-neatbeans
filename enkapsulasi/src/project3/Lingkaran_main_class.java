/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project3;

/**
 *
 * @author User
 */
public class Lingkaran_main_class {

    public static void main(String[] args) {
        Data object = new Data();

    // read and write dengan menggunakan public
    object.intPublic = 5; // Write
    System.out.println("public : " + object.intPublic); // read

    // read only (kita bisa menggunakan GETTER)
    int angka = object.getIntPrivate();
    System.out.println("getter : " + angka);

    // write only (kita hanya bisa menulis SETTER)
    object.setDoublePrivate(0.05);
    object.display();

    // gabungkan read dan write dengan setter dan getter
    Lingkaran object2 = new Lingkaran(5);
    System.out.println("jari-jari : " + object2.getJari2());
    object2.setJari2(14);
    System.out.println("jari-jari : " + object2.getJari2());
    System.out.println("Luas : " + object2.getLuas());
        
    }
    
}
