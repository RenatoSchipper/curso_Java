/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


/**
 *
 * @author User
 */
public class Mapa {
    public static void main(String[] args) {
        
        Map<Integer, String> usuarios = new HashMap<>();
        
        usuarios.put(1, "Roberto");
        usuarios.put(1, "Ricardo");
        usuarios.put(1, "Rafael");
        usuarios.put(1, "Rebeca");
        
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        
        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Rebeca"));
        
        System.out.println(usuarios.get(4));
        System.out.println(usuarios.remove(1));
        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        }
        for (String valor: usuarios.values()) {
            System.out.println();
        }
        for (Entry<Integer , String> registro: usuarios.entrySet() ){
            System.out.println(registro.getKey() + "==>");
            System.out.println(registro.getValue());
        }
        
    }
    
}
