/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questão.numero.pkg1;
import java.util.Scanner;

/**
 *
 * @author limal
 */
public class QuestaoNumero1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldo;
        double porcentual;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite seu Saldo");
        saldo = entrada.nextDouble();
        
        porcentual = 0;
        
        if (saldo <= 200) {
            porcentual = (saldo*0.1);
            
        }
        else {
            if (saldo > 200 && saldo <= 300){
                porcentual = (saldo*0.2);
              
                    }
            
            else {
                if (saldo > 300 && saldo <= 400){
                    porcentual = (saldo*0.25);
                   
                }
                
                else {
                    if (saldo >400){
                        porcentual = (saldo*0.30);
                                            }
                }
            
            }
        }
         System.out.println("Saldo = R$" + saldo + "\n"+ "porcentual = " + porcentual + "%");
    }
    
    
    
}