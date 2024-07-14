package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quantos alunos: ");
        int qndAluno = entrada.nextInt();
        
        System.out.println("Quantas notas: ");
        int qndNotas = entrada.nextInt();
        
        double notaDaTurma[][] = new double[qndAluno][qndNotas];
        double total = 0;
        for (int a = 0; a < notaDaTurma.length; a++) {
            for (int n = 0; n < notaDaTurma[a].length; n++) {
                System.out.printf("Informe a nota %d do aluno %d: ", (n+1), (a+1));
                notaDaTurma[a][n] = entrada.nextDouble();
                total =+ notaDaTurma[a][n];
            }
        } 
        
        double media = total / (qndAluno * qndNotas);
        System.out.println("Média da turma é: " + media);
        for(double[] notaDoAluno: notaDaTurma){
            System.out.println(Arrays.toString(notaDoAluno));
            
        }
        
        
        
        entrada.close();
    }
}

