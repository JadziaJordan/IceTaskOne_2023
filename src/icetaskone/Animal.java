/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetaskone;

import java.util.Scanner;

/**
 *
 * @author Jadzia Jordan
 */
public class Animal {
    
    private int IDtag;
    private String species;
    
    
    public void input ()
    {

        Scanner jk = new Scanner (System.in);
        System.out.println("Please enter the IDtag:");
        IDtag= jk.nextInt();
        jk.nextLine();
        System.out.println("Enter the species:");
        species=jk.nextLine();
    
    }
    
    
    public void output ()
    {
        System.out.println("The IDtag entered: "+ IDtag);
        System.out.println("The species entered:  "+species);
    }

  

   
}
