package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;


public class Cliente {
    
    List<Compra> compras = new ArrayList<>();
    String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
    void adicionarCompra(Compra compra){  //MÉTODO 
        this.compras.add(compra);
    }
     
    double obterValorTotal(){
        double total = 0;
        for (Compra compra : compras){
            total += compra.obterValorTotal();
        }
        return total;
    }
    
}
