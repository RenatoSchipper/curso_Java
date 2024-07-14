package fundamentos.operadores;


public class Relacionais {
    public static void main(String[] args) {
        
        int a = 97;
        int b = 'a'; //RECEBER UM VALOR DE UM CARACTERE ASPAS SIMPLES ''
        
        System.out.println(a == b); // COMPARAÇÃO
        System.out.println(30 != 7); // DIFERENTE
        System.out.println(3 > 4); // MAIOR  
        System.out.println(3 >= 4); // MAIOR OU IGUAL
        System.out.println(3 < 7); // MENOR
        System.out.println(30 <= 7); // MENOR OU IGUAL
        
        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >= 7;
       
        boolean temDesconto = bomComportamento && passouPorMedia;
        
        System.out.println("Tem desconto? "+ temDesconto);
        
        
    }
    
}
