package lambdas;

@FunctionalInterface
public interface Calculo {
     double executar(double a, double b);
     
     default String legal(){
         return "Legal";
     }
     static String muitoMegal(){
         return "Muito Legal";
     }
    
}
