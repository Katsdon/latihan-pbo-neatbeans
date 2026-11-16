/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project2;

import java.util.Scanner;

/**
 *
 * @author CilZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat objek HP
        Phone s24Ultra = new Samsung();

        // membuat objek user
        Phoneuser haye = new Phoneuser(s24Ultra);

        // kita coba nyalakan HP-nya
        haye.turnOnThePhone();
        
        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("-------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            if (aksi.equals("1")) {
                haye.turnOnThePhone();
            } else if (aksi.equals("2")) {
                haye.turnOffThePhone();
            } else if (aksi.equals("3")) {
                haye.makePhoneLouder();
            } else if (aksi.equals("4")) {
                haye.makePhoneSilent();
            } else if (aksi.equals("0")) {
                System.out.println("Program selesai.");
            } else {
                System.out.println("Pilihan tidak valid");
            }
            System.out.println();
        }
    }
}