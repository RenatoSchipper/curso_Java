package fundamentos;

import javax.swing.JOptionPane;


public class ConversaoStringNumeros {
    public static void main(String[] args) {
        
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");  //Botão visual 
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número");  //Botão visual 
        System.out.println(valor1 + valor2);
        
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        
        double soma = numero1 + numero2;
        System.out.println("Soma é: " + soma);
        System.out.println("media é: " + soma / 2);
    }
    
    
}
