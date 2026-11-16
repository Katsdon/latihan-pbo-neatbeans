/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1;

class StaticKelas {
    static int x;
    static int y;

    public static void ubahNilai() {
        x = 5;
        y = 10;
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        StaticKelas a = new StaticKelas();
        StaticKelas b = new StaticKelas();
        StaticKelas.ubahNilai();
        System.out.println("Nilai x : " + a.x);
        System.out.println("Nilai y : " + a.y);

        b.x = 7;
        b.y = 8;
        System.out.println("Nilai x : " + a.x);
        System.out.println("Nilai y : " + a.y);
        StaticKelas.x = 10;
        StaticKelas.y = 13;
        System.out.println("Nilai x : " + a.x);
        System.out.println("Nilai y : " + a.y);
    }
}