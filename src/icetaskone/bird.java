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
public class bird  extends Animal{
    
    private int colour;
    
    @Override
    public void input ()
    {
        Scanner jk = new Scanner (System.in);
        super.input();
        System.out.println("Enter the colour of the birds feathers (1=grey, 2=white, 3=black)");
        colour = jk.nextInt();
        
    }
    
    @Override
    public void output ()
    {
      super.output();
        System.out.println("Colour entered: "+colour);
    }
    
}
