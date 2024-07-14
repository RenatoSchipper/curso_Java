package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        
         HashSet conjunto = new HashSet();
                                // Concerter para uma CLASSE
         conjunto.add(1.2);     // double -> Double
         conjunto.add(true);    // boolean -> Doouble
         conjunto.add("Teste"); // String -> String
         conjunto.add(1);       // int -> Integer
         conjunto.add('x');     // Char ->  Caracter
         
         System.out.println(" Tamanho é " + conjunto.size());  //QUANTIDADE DE ELEMENTO DO CONJUNTO
         
         System.out.println(conjunto.remove("teste"));  //REMOVER
         System.out.println(conjunto.remove("Teste"));
         System.out.println(conjunto.remove('x'));
         
         System.out.println("Tamanho é " + conjunto.size());
         
         System.out.println(conjunto.contains('x'));  //  CONTEM OU CONTINUA 
         System.out.println(conjunto.contains(1));
         System.out.println(conjunto.contains(true));
         
         Set nums  = new HashSet();
         
         nums.add(1);
         nums.add(2);
         nums.add(3);
         
         System.out.println(nums);
         System.out.println(conjunto);
         
         //conjunto.addAll(nums); União entre dois conjuntos 
         conjunto.retainAll(nums); //INTERCEÇÃO Reter apenas o que esta dentro do outro conjuNto JUNTA OS DOIS (CONJUNTO + NUMS)
         System.out.println(conjunto);
         
         conjunto.clear(); //LIMPAR
         System.out.println(conjunto);
         
         
    }
    
}
