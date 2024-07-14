package execao.personalizadaB;

import execao.Aluno;

public class Validar {
    
    private Validar (){}

    public static void aluno (Aluno aluno) throws StringVaziaExeption, NumeroForaIntervaloExeption{
        
        if (aluno == null)
            throw new IllegalArgumentException("O Aluno está nulo");
        if (aluno.nome == null || aluno.nome.trim().isEmpty()) //trim tira espaço em branco, isEmpy se está vazia
            throw new StringVaziaExeption("Nome");
        if (aluno.nota < 0 || aluno.nota > 10 )
            throw new NumeroForaIntervaloExeption("Nota ");
    }

}
