/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

public class Teacher {
    public static String college = "ABC Colleger";
        static String profession = "Teaching";
        private static String code;
    
    static void duty(){
        System.out.println("This is duty of parent class");
    }
    
    static void setCode(String pCode){
        code = pCode;
    }
    
    static String getCode(){
        return code;
    }
}
