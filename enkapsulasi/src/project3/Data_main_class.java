/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project3;

/**
 *
 * @author User
 */
public class Data_main_class {

    public static void main(String[] args) {
         Data obj = new Data();

        // 1. Tampilkan nilai awal
        obj.display();

        // 2. Atribut public: boleh diubah langsung
        obj.intPublic = 99;

        // 3. Atribut private: dibaca lewat getter
        System.out.println("intPrivate = " + obj.getIntPrivate());

        // 4. Atribut private: diisi lewat setter
        obj.setDoublePrivate(3.14);

        // 5. Tampilkan lagi untuk melihat perubahannya
        obj.display();
    }
    
}
