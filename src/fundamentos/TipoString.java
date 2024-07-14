package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Ola pessoal".charAt(0)); //indentifica a litra atraves do index
        
        String s = "Boa tarde";
        System.out.println(s.concat("!!!")); //CONCATENAR "ACRESCENTAR"
        System.out.println(s + " !!! " ); 
        System.out.println(s.startsWith("Boa")); // VERIFICA SE INICIA COM  "Boa" ? true false
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE")); //endsWith TERMINA COM TARDE? true false
        System.out.println(s.length()); //QUANTOS CARCTERES TEM UM STRING
        System.out.println(s.toLowerCase().equals("boa tarde")); //equals COMPARAÃO DE IGUALDADE 
        System.out.println(s.equalsIgnoreCase("boa tarde")); // NAO VAI CONSIDERAR LETRAS MAIUCULUAS E MINUCULAS
        
        String nome = "Renato";
        String sobrenome = "Schipper";
        int idade = 33;
        double salario = 12345.987;
        
        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " 
                + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n";
        System.out.println(maisUmaFrase);
        
        System.out.printf("\nOsenhor %s %s tem %d anos e ganha R$%.2f. por mes ",
                nome, sobrenome, idade, salario);
        // %s String %d inteiro %f ponto flutuante, para utilizar % usa print"F"
        String frase = String.format("\nO senhor %s %s tm %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
        System.out.println(frase);
        
        System.out.println("Frase qualquer ".contains("qual")); // dentro da frase contem a palavra "qual"?
        System.out.println("Frase qualquer ".indexOf("qual")); // qual é o incide da palavra "qual"
        System.out.println("Frase qualquer ".substring(6)); // começa a partir do "6" vai printar "qualquer" 
        System.out.println("Frase qualquer ".substring(6, 8)); // começa no 6 e vai termina no  8 q
    }
    
}
;