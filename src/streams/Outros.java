package streams;

import java.util.Arrays;
import java.util.List;


public class Outros {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Pedro", 6.1);
        Aluno a7 = new Aluno("Gui", 8.1);
        Aluno a8 = new Aluno("Maria", 10);
        
    List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
    
        System.out.println("distinct...");
        alunos.stream()
                .distinct()//Não pega valor duplicado A NÃO SER QUE vc emplemente o equal E hashcode
                .limit(2) //limita
                .forEach(System.out::println);
        
        System.out.println("\nSkip/Limit");
        alunos.stream().distinct().skip(2).limit(1).forEach(System.out::println); 
        
        System.out.println("\ntakewhile");
       // alunos.stream().distinct().takeWhale(a -> a.nota >= 7).forEach(System.out::println);
       // takeWhale Do primirop valor acima de 7 ate encontrar o primeiro a baixo de 7.
        
    }
}
