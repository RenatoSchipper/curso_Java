package colecoes;


import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        
        //Set<String> listaAprovados = new HashSet <String> (); //vai aceitar apenas STRING ao definir (< > = tipos para os elementos)
        //TreeSet<String> listaAprovados = new TreeSet<>();       //GARANTE A ORDEM DE CEÇÃO 
        SortedSet<String> listaAprovados = new TreeSet<>();       //lista de conjunto que tem um critério de ordenação 
        listaAprovados.add("Paula");
        listaAprovados.add("Pedro");
        listaAprovados.add("Renato");
        listaAprovados.add("Victória");
        
        for(String candidatos: listaAprovados){
            System.out.println(listaAprovados);
        }
        
        Set<Integer> nums = new HashSet<> ();
        
        nums.add(1);
        nums.add(2);
        nums.add(10);
        nums.add(130);
        
        for (int valor: nums){
            System.out.println(valor);
        }
    }
    
}
