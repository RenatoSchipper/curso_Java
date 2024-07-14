package execao;

import streams.*;
import java.util.Objects;


public class Aluno {
    public final String nome;
    public final double nota; 
    public final boolean comportamento;

      
    public Aluno(String nome, double nota) {
       this(nome, nota, true);
    }
    public Aluno(String nome, double nota, boolean comportamento) {
        this.nome = nome;
        this.nota = nota;
        this.comportamento = comportamento;
    }
    public String toString(){
         return nome + " tem nota " + nota;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Aluno other = (Aluno) obj;
        if (Double.doubleToLongBits(this.nota) != Double.doubleToLongBits(other.nota)) {
            return false;
        }
        if (this.comportamento != other.comportamento) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
}
