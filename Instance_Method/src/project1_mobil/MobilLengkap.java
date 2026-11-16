package project1_mobil;

public class MobilLengkap {
  String warna;
  int tahunproduksi;
  String hidupkanmobil;
  String matikanmobil;
  int ubahgigi;
  
  void isiVariabel (String warnamobil, int tahunmobil, String hidupkan_mobl, String matikan_mobil, int ubah_gigi){
      warna = warnamobil;
      tahunproduksi = tahunmobil;
      hidupkanmobil = hidupkan_mobl;
      matikanmobil = matikan_mobil;
      ubahgigi = ubah_gigi;}
  
   void printmobil () {
      System.out.println("Warna Mobil : " + warna) ;
      System.out.println("Tahun Mobil : " + tahunproduksi) ;
      System.out.println("Hidupkan Mobil : " + hidupkanmobil) ;
      System.out.println("Matikan Mobil : " + matikanmobil) ;
      System.out.println("Ubah Gigi : " + ubahgigi) ;
  }  
}
