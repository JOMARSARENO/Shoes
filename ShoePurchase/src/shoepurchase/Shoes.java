/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoepurchase;

/**
 *
 * @author Oneras
 */
public class Shoes {
    public static void main(String[]args){
        
        ShoePurchase[] Shoes = new ShoePurchase[3];
        
        
        Shoes[0] = new ShoePurchase("vans", "nike", "converse", "under armour",  22, "Davao City");
        Shoes[1] = new ShoePurchase("medium", "small", "large", "XL");
        Shoes[2] = new ShoePurchase("20", 30, 50);
        
        
        System.out.println(Shoes[0].getBrand() + " " 
        + Shoes[0].getBrand().charAt(0) + ". "
        + Shoes[0].getSize() + "\n"
                + Shoes[0].getUnitPrice());
        
    }
    
}
