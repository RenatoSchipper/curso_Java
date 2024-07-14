package oo.composicao.casaB;

import oo.composicao.casaA.Ana;


public class Pedro extends Ana {
    
    void testeAcesso(){
      //  System.out.println(esposa.segredo); PRIVATE
      //  System.out.println(mae.facoDentroDeCasa); VISIVEL SOMENTE DENTRO DO PACOTE oo.composicao.casaA.Ana
        System.out.println(formaDeFalar);
        System.out.println(todoSabem); //public
        System.out.println(new Ana().todoSabem);//public
    
}

}
