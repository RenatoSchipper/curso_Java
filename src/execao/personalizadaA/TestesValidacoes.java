package execao.personalizadaA;

import execao.Aluno;


public class TestesValidacoes {
    public static void main(String[] args) {
        
        try {
            Aluno aluno = new Aluno("Ana", 7);
            Validar.aluno(aluno);
            
            Validar.aluno(null);
            
        } catch (StringVaziaExeption | NumeroForaIntervaloExeption e) {
            System.out.println(e.getMessage());
            //OU
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            
        }
           // catch (NumeroForaIntervaloExeption e){
           // System.out.println(e.getMessage());}
       
        System.out.println("Fim ;)");
    }

}
