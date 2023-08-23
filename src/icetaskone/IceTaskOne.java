/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetaskone;

/**
 *
 * @author Jadzia Jordan
 */
public class IceTaskOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        bird brd = new bird ();
        reptile rept = new reptile ();
        
        
       System.out.println("Enter the information for the bird.");
       brd.input();
       brd.output();
        
       System.out.println("Enter the information for the reptile ");
       rept.input();
       rept.output();
        
        
    }
    
}
