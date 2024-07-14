package fundamentos;


public class ConversaoNumeroString {
    public static void main(String[] args) {
        Integer num1 = 1000;
        System.out.println(num1.toString().length()); //.length para saber a quantidade de caracteres(SÓ ESTÁ DISPONIVEL PARA STRING)
        
        int num2 = 10000;
        System.out.println(Integer.toString(num2));
        
        System.out.println(("" + num1).length());
        System.out.println(("" + num2).length());
    }
    
}
