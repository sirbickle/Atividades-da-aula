/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.com.pkgwhile;
import java.util.Scanner;
/**
 *
 * @author limal
 */
public class CalculadoraComWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int multiplicacao;
        int contador;
        contador = 0;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println ("Digite o numero que deseja ver a tabuada");
        num= entrada.nextInt();
        
        while (contador <10) {
            contador ++;
            multiplicacao = num * contador;
            System.out.print (" Multipicação por " + contador + "  igual a  " + multiplicacao);
        }
        
                
    }
    
}
