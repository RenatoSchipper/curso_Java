package classe;

public class Usuario {

    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {
        Usuario outro = (Usuario) objeto;

        if (objeto instanceof Usuario) {//instanceof serve para verificar a compatibilidade entre um objeto, é usado para determinar se um objeto é de uma classe especifica

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean nomeEmail = outro.email.equals(this.email);

            return nomeIgual && nomeEmail;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 0;
    }

}
