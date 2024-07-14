package arrays;

import java.util.Arrays;


public class Exercicios {
    public static void main(String[] args) {
        
        double[] notaAluno = new double[4];
        System.out.println(Arrays.toString(notaAluno));
        
        notaAluno[0] = 9.7;
        notaAluno[1] = 7;
        notaAluno[2] = 6.4;
        notaAluno[3] = 7.3;
        
        System.out.println(Arrays.toString(notaAluno));//array.toString importa a biblioteca de java util 
        System.out.println(notaAluno[0]);
        System.out.println(notaAluno[notaAluno.length - 1]);
        //System.out.println(notaAluno[4]);  ERRO tentou ACESSAR UMA NOTA FORA DO ARRAY.
        
        double totalAlunoA = 0;
        for(int i = 0; i < notaAluno.length; i++){ //array.length ele percorre o que esta dentro do array mesmo havendo alteração no tamanho 
            totalAlunoA += notaAluno[i];
        }
        System.out.println(totalAlunoA / notaAluno.length);
        
        final double notaArmazenada = 5.9;
        double[] notaAlunoB = {6.9, 8.9, notaArmazenada, 10};
    }
    
}
