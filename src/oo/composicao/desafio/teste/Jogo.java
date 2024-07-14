package oo.composicao.desafio.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;


public class Jogo {
    public static void main(String[] args) {
        
        Heroi heroi = new Heroi(10,11);
        heroi.x = 10;
        heroi.y = 10;
        
        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 11;
        
        System.out.println("Monstro tem de vida =>" + monstro.vida);
        System.out.println("Heroi tem de vida =>" + heroi.vida);
        
        monstro.atacar(heroi);
        heroi.atacar(monstro);
        
        monstro.atacar(heroi);
        heroi.atacar(monstro);
        
        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);
        
        System.out.println("Monstro tem de vida =>" + monstro.vida);
        System.out.println("Heroi tem de vida =>" + heroi.vida);
        
        
    }
    
}