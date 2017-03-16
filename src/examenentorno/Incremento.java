/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenentorno;

/**
 *
 * @author rgonzalezrasero
 */
public class Incremento {
    int horas;
    int min;
    /**
     * 
     * @param horas
     * Recive un valor horas y lo incrementa en 1 hasta un limite de 24 
     */
    public void incrementoHoras(int horas){
       
        if(horas<=24){
        int incr;
       incr=horas+1;
            System.out.println("Has incrementado "+horas+"horas");
        }
        else
            System.out.println("Empieza desde cero otravez");
    }
    /**
     * 
     * @param min 
     * Recive un valor min y lo incrementa en 1 hasta un limite de 60 
     */
    public void incrementoMinutos(int min){
        if(min<=60){
        int incr;
       incr=min+1;
            System.out.println("Has incrementado "+min+"minutos");
        }
        else
            System.out.println("Empieza desde cero otravez");
    }
}
