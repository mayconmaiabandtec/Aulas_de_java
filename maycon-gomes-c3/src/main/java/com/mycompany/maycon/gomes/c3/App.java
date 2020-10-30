/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maycon.gomes.c3;

/**
 *
 * @author mmaia
 */
public class App {
    public static void main(String[] args) {
        VeterinarioClinico vtCli1 = new VeterinarioClinico(2050, "Maycon",4,750.00);
          VeterinarioClinico vtCli2 = new VeterinarioClinico(5943, "Franklin",9,900.00);
          
          VeterinarioCirurgiao vetCir1 = new VeterinarioCirurgiao(4512, "Beatriz", 23, 102.00);
          VeterinarioCirurgiao vetCir2 = new VeterinarioCirurgiao(4512, "Beatriz", 23, 102.00);
          
          
          System.out.println(String.format(vtCli1));
          System.out.println(String.format(vtCli2));
          
          System.out.println(String.format(vetCir1));
          System.out.println(String.format(vetCir2));
          
          
          
          
    }
}
