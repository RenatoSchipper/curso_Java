package oo.composicao;

import oo.composicao.Aluno;
import oo.composicao.Curso;


public class CursoTeste {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Pedro");
        Aluno aluno3 = new Aluno("Maria");
        
        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");
        
        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        
        curso2.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno3);
        
        aluno1.adicionarCurso(curso1);
        aluno1.adicionarCurso(curso2);
        aluno1.adicionarCurso(curso3);
        for (Aluno aluno: curso3.alunos){
            System.out.println("Estou matriculado no curso ..." + curso3.nome + "...");
            System.out.println("... e o meu nome é " + aluno.nome);
            System.out.println();
        }
        System.out.println(aluno1.cursos.get(0).alunos);
        
        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
        
        if (cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
        
    }
    
}
