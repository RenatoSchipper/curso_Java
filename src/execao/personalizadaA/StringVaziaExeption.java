package execao.personalizadaA;

@SuppressWarnings ("serial") 
public class StringVaziaExeption extends RuntimeException{
    
    private String nomeDoAtributo;

    public StringVaziaExeption(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    
    public String getMessage() {
        return String.format(" O Atributo '%s' está vazio ",nomeDoAtributo);
    }
    
    

}
