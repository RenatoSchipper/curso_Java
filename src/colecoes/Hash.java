package colecoes;

import java.util.HashSet;


public class Hash {
    public static void main(String[] args) {
        
        HashSet<Usuario> usuario = new HashSet<>();
        usuario.add(new Usuario("Pedro"));
        usuario.add(new Usuario("Ana"));
        usuario.add(new Usuario("Guilherme"));
        
        System.out.println(new Usuario("Guilherme"));
    }
    
}
