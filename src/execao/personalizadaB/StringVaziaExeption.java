package execao.personalizadaB;

@SuppressWarnings ("serial") 
public class StringVaziaExeption extends Exception{
    
    private String nomeDoAtributo;

    public StringVaziaExeption(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    
    public String getMessage() {
        return String.format(" O Atributo '%s' está vazio ",nomeDoAtributo);
    }
    
    

}
