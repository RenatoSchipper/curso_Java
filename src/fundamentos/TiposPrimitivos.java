package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
       
        //Tipos de Inteoiros 
        byte anosDeEmpresa = 23;
        short numerosDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;
        
        // Tipos numericos reais 
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.011;
        
        // Tipos booleano
        boolean estaDeFerias = false; // true
        
        //tipos caracteres
        char status = 'A'; //Ativo
        
        //Dias de Empresa
        System.out.println(anosDeEmpresa * 365);
        
        //Numeros de voos
        System.out.println(numerosDeVoos / 2);
        
        //Pontos Real
        System.out.println(pontosAcumulados / vendasAcumuladas);
        
        System.out.println(id + ": ganha -> " + salario);  
        System.out.println("Ferias? " + estaDeFerias);
        System.out.println("Status " + status);
    }
    
}
