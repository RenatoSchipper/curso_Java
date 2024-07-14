package execao.personalizadaA;

@SuppressWarnings ("serial") 
public class NumeroForaIntervaloExeption extends RuntimeException{
    
    private String nomeDoAtributo;

    public NumeroForaIntervaloExeption(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    
    public String getMessage() {
        return String.format(" O Atributo '%s' está fora do intervalo ",nomeDoAtributo);
    }
    
    

}
