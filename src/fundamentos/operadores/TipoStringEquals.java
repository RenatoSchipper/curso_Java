package fundamentos.operadores;

import java.util.Scanner;


public class TipoStringEquals {
    public static void main(String[] args) {
        
        System.out.println("2" == "2");
        
        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));
        
        Scanner entrada = new Scanner(System.in);
        
        String s2 = entrada.next();// nextLine qnd imprime, ele acrescenta da forma que você digitou. .next tira os espaço.
        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2.trim())); //.equals (compara as STRING). .trim (tira os espaços em brancos)
        
        //PARA COMPARA STRING USAR O .equals E NÃO O ==
        
        entrada.close();
    }
    
}
