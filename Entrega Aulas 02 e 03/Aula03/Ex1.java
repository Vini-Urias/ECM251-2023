package Aula03;
import java.util.Scanner;
import java.util.Calendar;
/*
 * Codigo nao continua depois da pergunta "Ja fez aniversario esse ano"
 * Retirei a pergunta e a condicao por isso e considerei que o usuario fez aniversario esse ano sempre 
 * 
 * 
*/

public class Ex1 {
    public static void main(String args[]) {
        int idade;
        int dias;
        String resposta = "sim";
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        //System.out.println("Ja fez aniversario esse ano?");
        //resposta = sc.nextLine();
        Calendar c = Calendar.getInstance();
        int ano_atual = c.get(Calendar.YEAR);
        int mes_atual = c.get(Calendar.MONTH);
        int dia_atual = c.get(Calendar.DAY_OF_MONTH);
        dias = dia_atual;
        mes_atual = mes_atual - 1;

        if(resposta.equals("Sim") || resposta.equals("sim")){
            for (int x=1; x<=idade; x++){
                for(mes_atual=1; mes_atual<=12;mes_atual--){
                    if(ano_atual%4==0){
                        if(ano_atual%100!=0){
                            switch(mes_atual){
                                case 1:
                                dias = dias+31;
                                case 2:
                                dias = dias+29;
                                case 3:
                                dias = dias+31;
                                case 4:
                                dias = dias+30;
                                case 5:
                                dias = dias+31;
                                case 6:
                                dias = dias+30;
                                case 7:
                                dias = dias+31;
                                case 8:
                                dias = dias+31;
                                case 9:
                                dias = dias+30;
                                case 10:
                                dias = dias+31;
                                case 11:
                                dias = dias+30;
                                case 12:
                                dias = dias+31;
                            }
    
                        }
                    }
                    else {
                        switch(mes_atual){
                            case 1:
                            dias = dias+31;
                            case 2:
                            dias = dias+28;
                            case 3:
                            dias = dias+31;
                            case 4:
                            dias = dias+30;
                            case 5:
                            dias = dias+31;
                            case 6:
                            dias = dias+30;
                            case 7:
                            dias = dias+31;
                            case 8:
                            dias = dias+31;
                            case 9:
                            dias = dias+30;
                            case 10:
                            dias = dias+31;
                            case 11:
                            dias = dias+30;
                            case 12:
                            dias = dias+31;
                        }
                    }
                }
                ano_atual = ano_atual - 1;
                mes_atual = 12;
            }
        }
        else {
            for (int x=1; x<=idade+1; x++){
                for(mes_atual=1; mes_atual<=12;mes_atual--){
                    if(ano_atual%4==0){
                        if(ano_atual%100!=0){
                            switch(mes_atual){
                                case 1:
                                dias = dias+31;
                                case 2:
                                dias = dias+29;
                                case 3:
                                dias = dias+31;
                                case 4:
                                dias = dias+30;
                                case 5:
                                dias = dias+31;
                                case 6:
                                dias = dias+30;
                                case 7:
                                dias = dias+31;
                                case 8:
                                dias = dias+31;
                                case 9:
                                dias = dias+30;
                                case 10:
                                dias = dias+31;
                                case 11:
                                dias = dias+30;
                                case 12:
                                dias = dias+31;
                            }
                        }
                    }
                    else {
                        switch(mes_atual){
                            case 1:
                            dias = dias+31;
                            case 2:
                            dias = dias+28;
                            case 3:
                            dias = dias+31;
                            case 4:
                            dias = dias+30;
                            case 5:
                            dias = dias+31;
                            case 6:
                            dias = dias+30;
                            case 7:
                            dias = dias+31;
                            case 8:
                            dias = dias+31;
                            case 9:
                            dias = dias+30;
                            case 10:
                            dias = dias+31;
                            case 11:
                            dias = dias+30;
                            case 12:
                            dias = dias+31;
                        }
                    }
                }
                ano_atual = ano_atual - 1;
            }
        }
        System.out.println(dias);
        sc.close();
    }
}
