/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

/**
 *
 * @author Oneras
 */
public class Lesson1 {
    
    public static void main(String[] args){
        Person[] person = new Person[3];
        
        person[0] = new Person("Dela Cruz", "juan", "Perez", 18, "Davao City");
        person[1] = new Person("Magtanggol", "Asuncion", "Tahimik", 20, "Manila");
        person[2] = new Person("La Paz", "Asuncion", "Santos", 30, "Cebo City");
        
        
        
        System.out.println(person[0].getFirstname() + " "
                + person[0].getMiddlename().charAt(0) + ". "
                + person[0].getLastname() + ", "
                + person[0].getAge() + "\n"
                + person[0].getAddress());
        
                        
                
    }
    
    
    
}
