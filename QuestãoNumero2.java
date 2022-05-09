/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questãonumero2;
import java.util.Scanner;

/**
 *
 * @author limal
 */
public class QuestãoNumero2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double peso, idade, dosagem;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println ("Digite a sua idade");
        idade = entrada.nextDouble();
        
        System.out.println ("Digite o seu peso em KG");
        peso = entrada.nextDouble();
        
        if (idade >=12 && peso >=60){
            dosagem = 20*1000/500;
                    System.out.println("Você deve tomar " + dosagem + " gotas do remédio");
        }
        else {
            if (idade >=12 && peso <= 60){
                dosagem = 20*875/500;
                        System.out.println("Você deve tomar " + dosagem + " gotas do remédio");
            }
            else {
                if (idade <12 && peso >=5 && peso <=9){
                    dosagem = 20*125/500;
                           System.out.println("Você deve tomar " + dosagem + " gotas do remédio");
                }
                else{
                    if (idade <12 && peso >= 9.1 && peso <=16) {
                        dosagem = 20*250/500;
                            System.out.println("Você deve tomar " + dosagem + " gotas do remédio");
                        }
                    else {
                        if (idade <12 && peso >= 24.1 && peso <= 30) {
                            dosagem = 20*500/500;
                                   System.out.println("Você deve tomar " + dosagem + " gotas do remédio");
                        }
                        else {
                            if (idade <12 && peso >30);
                            dosagem = 20*750/500;
                                    System.out.println("Você deve tomar " + dosagem + " gotas do remédio");

                        }
                    }
                }
            }
        }
                
        
        
 
            }
    
}
