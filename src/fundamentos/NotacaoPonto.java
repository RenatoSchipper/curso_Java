
package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        
        String s = "Bom dia X";
        s = s.replace("X", "Senhor"); //Substitui
        s = s.toUpperCase(); //Converter para letra maiuscula
        s = s.concat("!!!"); // Concatena
        
        System.out.println(s);
        
        String x = "Renato".toUpperCase();
        System.out.println(x);
        
        String y = "Bom dia X"
                .replace("X", "Gabriel")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);
        
        //Tipos primitivos não tem o operador "."
        int a = 3;
        System.out.println(a);
        
    }
}
