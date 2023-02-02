/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintang.stambuk;

/**
 *
 * @author Lucifertheangel
 */
public class BINTANGSTAMBUK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // for ini di gunakan untuk membuat angka 0
       for(int i=1;i<=5;i++) {
          for(int j=1;j<=5;j++){
                if(i==1 || i==5 )
                   System.out.print("* ");
                else if(j==1 || j==5)
                   System.out.print("* ");
                else
                   System.out.print("  ");
        // for berikutnya di gunakan untuk membuat angka kedua yaitu 8
            }
            System.out.print(" ");
            for(int j=1;j<=5;j++){
            
                if(i==1||i==3||i==5)
                    System.out.print("* ");
                else if(j==1||j==5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                //for selanjutnya di gunakan untuk membuat huruf K 
                //menggunakan %% agar terprint satu-satu
            }
            System.out.print(" ");
            for(int j=1;j<=5;j++){
                if(j==1 || i+j==5)
                    System.out.print("* ");
                else if(i+j==7 && i==4)
                    System.out.print("* ");
                else if (i+j==9 && i==5)
                    System.out.print("* ");
                else
                    System.out.print("  "); 
            }          System.out.println();
          }
    }
    
}
