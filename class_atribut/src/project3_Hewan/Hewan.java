/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project3_Hewan;

public class Hewan {
    public void suaraHewan() {
        System.out.println("Hewan bersuara");
    }
}

class Tikus extends Hewan {
    public void suaraHewan() {
        System.out.println("Anjing bersuara : guk guk");
    }
}

class Kucing extends Hewan {
    public void suaraHewan() {
        System.out.println("Kucing bersuara : meong meong");
    }
    
}

class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hewan hewanSaya = new Hewan();
        Hewan tikusSaya = new Tikus();
        Hewan kucingSaya = new Kucing();
        hewanSaya.suaraHewan();
        tikusSaya.suaraHewan();
        kucingSaya.suaraHewan();
    }
}
