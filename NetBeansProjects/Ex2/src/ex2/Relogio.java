/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

import java.util.Calendar;


public class Relogio {
    public Mostrador hora;
    public Mostrador minuto;
    public Mostrador segundo;
    public String mostrador;

    
    Calendar now = Calendar.getInstance();
    private int hour = now.get(Calendar.HOUR_OF_DAY);
    private int minute = now.get(Calendar.MINUTE);
    private int second = now.get(Calendar.SECOND);
    
    
    public Relogio(){
        hora = new Mostrador(24, hour);
        minuto = new Mostrador(60, minute);
        segundo = new Mostrador(60, second);
        atualizaMostrador();
    }

    public void TicTac(){
        segundo.incrementa();
        if(segundo.getValor()==0){
            minuto.incrementa();
            if(minuto.getValor() == 0){
                hora.incrementa();
            }
        }
        atualizaMostrador();
    }

    private void atualizaMostrador(){
        mostrador = hora.mostra()+":"+minuto.mostra()+":"+segundo.mostra();
    }
    
    public String mostra(){
        this.atualizaMostrador();
        return mostrador;
    }
    
    public void setHora(int h){
        hora.setValor(h);
        
    }
    
    public void setMinuto(int m){
        minuto.setValor(m);
        
    }
    
    public void setSegundo(int s){
        segundo.setValor(s);
        
    }
    
}