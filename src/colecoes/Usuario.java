package colecoes;

import java.util.Objects;

public class Usuario {

        String nome;
        
        Usuario(String nome){
        this.nome = nome;
        }

    @Override
    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }
        
        

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    

    

}
