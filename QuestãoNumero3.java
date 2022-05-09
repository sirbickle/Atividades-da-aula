/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questão.numero.pkg3;
import java.util.Scanner;

/**
 *
 * @author limal
 */
public class QuestãoNumero3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double troco;
        int nota, moeda;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do troco: ");
                troco = entrada.nextDouble();
                nota = 0;
                moeda = 0;
                while (troco >0.00){
                    
                    if (troco >= 100){
                        troco = troco -100;
                                System.out.println("Nota de 100");
                                nota++;
                    }
                    else{
                            if(troco >=50 && troco < 100){
                            troco = troco - 50;
                            System.out.println("Nota de 50");
                            nota++;
                }
                            
                            if (troco >=25 && troco < 50){
                            troco = troco - 25;
                            System.out.println("Nota de 25");
                            nota++;
                }
                            
                            if (troco >=10 && troco <= 25){
                            troco = troco - 10;
                            System.out.println("Nota de 10");
                            nota++;
    }
                            
                            if (troco >=5 && troco <= 10){
                            troco = troco - 5;
                            System.out.println("Nota de 5");
                            nota++;
                }
                            if (troco >=1 && troco < 5){
                            troco = troco - 1;
                            System.out.println("Moeda de 1 real");
                            moeda++;
                    }       
                            if (troco >=0.50 && troco < 1){
                            troco = troco - 0.50;
                            System.out.println("Moeda de 50 centavos");
                            moeda++;
                }
                            if (troco >=0.25 && troco < 0.50){
                            troco = troco - 0.25;
                            System.out.println("Nota de 0.25");
                            moeda++;
                    }
                            if (troco >=0.10 && troco < 0.25){
                            troco = troco - 0.10;
                            System.out.println("Moeda de 10 centavos");
                            moeda++;
                    }
                            if (troco >=0.05 && troco < 0.1){
                            troco = troco - 0.05;
                            System.out.println("Moeda de 5 centavos");
                            moeda++;
                    }
                            if (troco >=0.01 && troco < 0.05){
                            troco = troco - 0.01;
                            System.out.println("Moeda de 1 centavo");
                            moeda++;
}
                            
    }
                }
                System.out.println("Numero de notas " +nota);
                            System.out.println("Numero de moedas " +moeda);
    }
}

