/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projrct2;

/**
 *
 * @author User
 */
public class MobilLengkap { 
    String warna;
    int tahunproduksi;
    String hidupkanmobil;
    String matikanmobil;
    int ubahgigi;
    
    void isiVariabel (String warnamobil, int tahunmobil, String hidupkan_mobil,
            String matikan_mobil, int ubah_gigi){
    warna = warnamobil;
    tahunproduksi = tahunmobil;
    hidupkanmobil = hidupkan_mobil;
    matikanmobil = matikan_mobil;
    ubahgigi = ubah_gigi;
    }
    
    void printmobil () {
        System.out.println("warna mobil : " + warna);
        System.out.println("tahun mobil : " + tahunproduksi);
        System.out.println("hidupkan mobil : " + hidupkanmobil);
        System.out.println("matikan mobil : " + matikanmobil);
        System.out.println("ubah gigi : " + ubahgigi
    }
}
    
