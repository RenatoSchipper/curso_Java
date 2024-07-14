package fundamentos;


public class Wrapper {
    public static void main(String[] args) {
        
        //byte
        Byte b = 100;
        Short s = 1000;
        
        // Ineger.parseInt(enrada.next())); Converteu uma strig para número interitpo
        Integer i = 10000;
        Long l = 100000L;
        
        System.out.println(b.byteValue()); //mostra o valor de Byte
        System.out.println(s.toString()); //Converte o valor em String
        System.out.println(i * 3);
        System.out.println(l / 3);
        
        Float f = 123.10F;
        System.out.println(f);
        
        Double d = 1234.4568;
        System.out.println(d);
        
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());
        
        Character c = '#'; //char
        System.out.println(c);
        
        
        
    }
    
}
