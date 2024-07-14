package estruturaDeControle;

import java.util.Scanner;


public class IfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua nota: ");
        float nota = entrada.nextFloat();
        
        if(nota>10 || nota <0)
            System.out.println("Nota inválida.");
        else if(nota>=7 && nota <=10)
            System.out.println("Aprovado.");
        else if(nota < 7 && nota >= 5.0)
            System.out.println("Recuperação.");
        else System.out.println("Reprovado");
        
        System.out.println("Fim!!");
    }
    
}
