package fundamentos;

import java.util.Scanner;


public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!");
        
        System.out.println("Bom ");
        System.out.println(" dia");
        
        System.out.printf("Megasena %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
        
        System.out.printf("Salário: %.2f", 12345.12545);
        System.out.printf("Nome: %s", "Renato");
        
        Scanner entrada = new Scanner (System.in); //Scaner.in entrada do sistema 
        
        System.out.println("\nDigite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("\nDigite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.printf("\nNome: %s %s \nIdade: %d", nome, sobrenome, idade);
        
        System.out.println("\n\nNome = "+ nome);
        entrada.close();
                
    }
    
}
