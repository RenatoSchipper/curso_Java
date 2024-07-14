package oo.composicao;


public class CompraTeste {
    public static void main(String[] args) {
        Compra compra = new Compra();
        compra.cliente = "João Pedro";
        
        compra.itens.add(new Item("Caneta", 10, 4.5));
        compra.itens.add(new Item("Borracha", 5, 2.5));
        compra.itens.add(new Item("Caderno", 3, 19.5));
        
        
        System.out.println(compra.itens.size());
        System.out.println(compra.obterValorTotal());
    }
    
}
