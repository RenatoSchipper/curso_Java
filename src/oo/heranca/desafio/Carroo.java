package oo.heranca.desafio;


public class Carroo {
    
    public  int velocidadeAtual;
    protected int VELOCIDADE_MAXIMA;
    private int delta = 5;

    
     
   protected Carroo(int velocidadeMaxima) {
       VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
   public void acelerar (){
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;            
        }else   
        velocidadeAtual += getDelta();
    }
   public void frear (){
        if (velocidadeAtual >= 5 ) {
            velocidadeAtual -= 5;            
        } else{
        velocidadeAtual =0;
        }
    }
    public String toString(){
        return "Velocidade atual é " + velocidadeAtual + " km/h";        
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
    
}
