package oo.heranca.desafio;


public class Ferrari extends Carroo implements Esportivo, Luxo{

  //  void acelerar() {
  //      velocidadeAtual += 15;
  //      super.acelerar();
  //  }
    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

     public Ferrari() {
         this(315);
    }
     
    public  Ferrari(int veloxidadeMaxima){
       super(veloxidadeMaxima);
       setDelta(15);
     }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;   
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;  
    }

    @Override
    public void ligarAr() {
        ligarAr = true;   
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        }else if (ligarTurbo && ligarAr){
            return 30;
        }else if(!ligarTurbo && !ligarAr){
            return 20;            
        }else
        return 15;
    }
    
    
    
    
    
    
    

}
