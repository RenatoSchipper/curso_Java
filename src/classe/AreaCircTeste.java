package classe;


public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(10);
        //a1.pi = 1000;
        System.out.println(a1.area());
        
        AreaCirc a2 = new AreaCirc(5);
        //a2.pi = 0;
        
       // AreaCirc.PI = 3.1415;
        
        System.out.println(a1.area());
        
       // AreaCirc.PI = 0.1;
        System.out.println(a2.area());
    }
}
