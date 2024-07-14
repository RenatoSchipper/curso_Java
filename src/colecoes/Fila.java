package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();
        
        fila.add("Ana");   //Lançará uma exceção caso a fila esteja cheia.(Retorna NULL)
        fila.offer("Bia"); //Retorna falso caso a fila esteja cheia e nao add.      (Gera ERRO)
        fila.add("Carlos");   
        fila.offer("Daniel"); 
        fila.add("Rafael");   
        fila.offer("Gui");
        //Os dois ADICIONA elemento na fila
        
        System.out.println(fila.peek());//Lê o elemtento da fila mas não remove. Se estiver vazio retorna NULL.
        System.out.println(fila.peek());
        System.out.println(fila.element());  //Lê o elemtento da fila mas não remove. Se estiver vazio ERRO 
        System.out.println(fila.element());
        
        //fila.size(); Tamanho da fila
        //fila.clear(); Limpar fila 
        //fila.isEmpty(); Saber se está VAZIA.
        //fila.poll(); Retorna o primeiro Elemento e EXCLUI.
        //fila.remove(); Se estiver VAZIA e for remover o que não tem da ERRO.
        
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll()); 
        System.out.println(fila.poll());
        
        
        
    }
    
}
