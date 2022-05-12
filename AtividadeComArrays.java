/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.com.arrays;

/**
 *
 * @author limal
 */
public class AtividadeComArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vetor = {-4, -5, 15, 50, 8, 4};
        
        System.out.println("Vetor: ");
        int count =0;
        while (count < vetor.length) {
            System.out.println(vetor [count] + " ");
            count++;
        }
                System.out.println("\nVetor: ");

        for(int i = (vetor.length -1); i >= 0; i --) {
            System.out.println(vetor[i] +  "  ");
    }  
    }
    
}
