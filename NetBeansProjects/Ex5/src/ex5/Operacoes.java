/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5;

/**
 *
 * @author vinic
 */

import java.util.ArrayList; 


public class Operacoes {
    
    private ArrayList<Integer> numeros = new ArrayList<Integer>();
    
    public Operacoes(){
        
    }
    
    public int adicao(int num){
        numeros.add(num);
        int ad=0;
        int ultimoIndice = numeros.size()-1;
        ad +=numeros.get(ultimoIndice);
        return ad;
    }
    
    
}
