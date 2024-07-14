package oo.polimorfismo;


public class Pessoa {
    private double peso;
    
    public Pessoa (double peso){
        setPeso(peso);
    }
    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }
   

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        if (peso >= 0 ) {
        this.peso = peso;            
        }
    }

    void comer(Arroz ingrediente1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
