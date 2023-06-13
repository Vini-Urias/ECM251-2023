/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

public class Mostrador{
    private int valor;
    private int limite;


    public Mostrador (int limite, int valor){
        this.limite =  limite;
        this.valor = valor;
    }
    public int getValor(){
        return valor;
    }
    public void incrementa(){
        valor = (valor+1)%limite;
    }
    public String mostra(){
        if(valor<10){
            return "0"+valor;
        }else{
            return ""+valor;
        }
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    
}
