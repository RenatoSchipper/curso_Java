package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class CriandoStreams {
   
    public static void main(String[] args) {
        
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::print;
        
        Stream<String> langs = Stream.of("Java, ", "Lua, ", "JS\n");
        langs.forEach(print);
        
        String [] maisLangs = {"Python, ","Lisp, ","Perl, ", "Go.\n "};
        
        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs,1,3).forEach(print);
        
        List<String> outraLangs = Arrays.asList("C ","PHP ", "Kotlin ");
        outraLangs.stream().forEach(print);
        outraLangs.parallelStream().forEach(print);
        
        //Stream.generate(() -> "a").forEach(print); Gerar uma string de forma infinita
        //Stream.iterate(0, n -> n +1).forEach(println); Gerar um valor inteiro 
    }

}
