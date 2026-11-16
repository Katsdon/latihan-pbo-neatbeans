/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project2;

/**
 *
 * @author CilZ
 */
class Orang {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setnama(String newNama) {
        this.nama = newNama;
    }
}
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Orang obj1 = new Orang();
                    obj1.setnama("Brojonegoro");

        System.out.println(obj1.getNama());
    }
    
}