package classe;

public class Equals {
    public static void main(String[] args) {
         Usuario u1 = new Usuario();
         u1.nome = "Pedro Silva";
         u1.email = "pedrosilva@gmail.com";
         
         Usuario u2 = new Usuario();
         u2.nome = "Pedro Silva";
         u2.email = "pedrosilva@gmail.com";
         
         System.out.println(u1 == u2); // Comparando o endereço de memória FALSE
         System.out.println(u1.equals(u2)); //Comparando o endereço de memória FALSE
         System.out.println(u1 == u1); // Comparando o endereço de memória TRUE
         System.out.println(u1.equals(u1)); //Comparando o endereço de memória TRUE
         
    }
    
}
