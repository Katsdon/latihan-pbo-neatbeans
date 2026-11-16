/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1;

/**
 *
 * @author User
 */
public class enkapsulasi_main_classs {

    public static void main(String[] args) {
    enkapsulasi Biodata = new enkapsulasi();

    Biodata.Nama = "M. Fadhil Hibatullah"; // (Nama Masing2)
    Biodata.NIM = "25041450157";  // (NIM masing2)
    Biodata.Kelas = "2583F"; // (Kelas Masing2)
    Biodata.setNilai(90);
    
    System.out.println("Nama  = " + Biodata.Nama);
    System.out.println("NIM   = " + Biodata.NIM);
    System.out.println("Kelas = " + Biodata.Kelas);
    System.out.println("Nilai = " + Biodata.getNilai());
    }
    
}
