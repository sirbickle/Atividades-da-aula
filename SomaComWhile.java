/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soma.com.pkgwhile;
import java.util.Scanner; 
/**
 *
 * @author limal
 */
public class SomaComWhile {
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double celsius, converFahr;
       
       celsius =0 ;
       
       while (celsius <10){ // utiliza o < para escolher a quantidade que quer no loop
           celsius ++;
           converFahr = (1.8*celsius)+32;
           System.out.println ("Valor em celsius " + celsius);
           System.out.println ("Valor em Fahreint " + converFahr); 
       }
       
    }
    
}
