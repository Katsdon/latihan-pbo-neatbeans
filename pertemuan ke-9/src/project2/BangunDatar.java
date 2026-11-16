/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

public abstract class BangunDatar {

    // Method abstrak (tidak memiliki isi/body, wajib di-override oleh subclass)
    public abstract double hitungLuas();

    // Method biasa (konkret) yang bisa langsung diwarisi
    public void tampilkanInfo() {
        System.out.println("Ini adalah kelas abstrak BangunDatar");
    }
}

