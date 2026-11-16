/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1;

/**
 *
 * @author User
 */
public class InheritanceCth extends Teacher {

    public static void main(String[] args) {
        String name = "Jhon";
        String departement = "Physics";

        System.out.println("Name = " + name);
        System.out.println("Profession = " + profession);   // dari Teacher
        System.out.println("Departement = " + departement);
        System.out.println("College = " + college);         // dari Teacher

        duty();                                             // versi child
        System.out.println();

        setCode("abc123");                                  // dari Teacher
        System.out.println("Code = " + getCode());          // dari Teacher
    }

    static void duty() {
        System.out.println("This is duty of child class");
       
    }
    
}
