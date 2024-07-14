package fundamentosOperacionais;


public class DesafioAritmetico {
    public static void main(String[] args) {
        
        /*int a = 3 * 4 - 10;
        int b =(int) Math.pow(a, 3);
        double c = Math.pow(a, 3);
        
        System.out.println(b);
        System.out.println(c);
        */
        
        
       /* double a = 6 * (3+2);
        double b = Math.pow(a, 2);
        double c = 3*2;
        
        double d = (1-5) * (2-7);
        double e = Math.pow(d, 2);
        double f = 2;
        
        double g = (b / c)-(e / f);
        double h = Math.pow(g, 3);
        double i = Math.pow(10, 3);
        
        
        System.out.println(b/c);
        System.out.println(e/f);
        System.out.println(g);
        System.out.println(h/i);
        */
       
       double numA = Math.pow(6 * (3+2), 2);
       double denA = 3*2;
       
       double numB = (1 - 5) * (2 - 7);
       double denB = 2;
       
       double superiorA = numA/denA;
       double superiorB = Math.pow(numB / denB, 2);
       
       double superior = Math.pow(superiorA - superiorB, 3);
       double inferior = Math.pow(10, 3);
       
       double resultado = superior / inferior;
       
        System.out.println("O resultado " + resultado);
               
        
        
    }
    
}
