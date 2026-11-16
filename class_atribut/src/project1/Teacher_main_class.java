/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1;

/**
 *
 * @author User
 */
public class Teacher_main_class extends Teacher {

    public static void main(String[] args) {
       String name = "john";
            String department = "Pysics";
            
            System.out.println("Name = "+ name);
            System.out.println("Profession = "+ profession);
            System.out.println("Department = "+ department);
            System.out.println("College = "+ college);
            
            duty();
            
            System.out.println();
            setCode("abcd123");
            System.out.println("Code = "+ getCode());
    }
    static void duty(){
        System.out.println("this is duty of child class");  
    }
    
}
