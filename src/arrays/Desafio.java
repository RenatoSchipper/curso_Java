package arrays;

import java.util.Scanner;


public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de notas: ");
        int qtdNotas = entrada.nextInt();
        
        double[] notas = new double[qtdNotas];
        //ou double notas[] = new double [qtdNotas];
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }
         double total = 0;
         for(double nota: notas){
             total += nota;
         }
         double media = total / notas.length;
         if ( media >= 7)
         System.out.println("Você passou sua média é " + media + "!");
         else 
             System.out.println("Ano que vem te vejo de novo campeão!!!");
         
         entrada.close();  
        
        //.length  = arry
    }
    
}
