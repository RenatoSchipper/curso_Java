package execao;


public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
        try {
            gerarErro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            gerarErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Fim!!");
    }
    //EXEÇÃO NÃO CHECADA ou NÃO VERIFICADA
    static void gerarErro1(){
      throw  new RuntimeException("Ocorreu um erro bem legal! #02 ");
    }
    //EXEÇÃO CHECADA ou VERIFICADA
    static void gerarErro2()throws Exception {
      throw  new Exception("Ocorreu um erro bem legal! #02 ");
    }

}
