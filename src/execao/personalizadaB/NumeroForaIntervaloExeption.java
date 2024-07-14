package execao.personalizadaB;

@SuppressWarnings ("serial") 
public class NumeroForaIntervaloExeption extends Exception{
    
    private String nomeDoAtributo;

    public NumeroForaIntervaloExeption(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    
    public String getMessage() {
        return String.format(" O Atributo '%s' está fora do intervalo ",nomeDoAtributo);
    }
    
    

}
