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
public class reptile extends Animal {
    
    private double bloodTemp;
    
    @Override
    public void input ()
    {
        Scanner jk = new Scanner (System.in);
        super.input();
        System.out.println("Enter the reptiles Blood tempreture");
        bloodTemp = jk.nextInt();
        this.bloodTemp = bloodTemp;    
    }
    
    @Override
    public void output ()
    {
      super.output();
        System.out.println("Blood tempreture entered: "+bloodTemp);
    }
    
    
}
