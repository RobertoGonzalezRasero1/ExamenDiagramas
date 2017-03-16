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
public class Display {
    OnOf enc = new OnOf();
    Incremento incre = new Incremento();
    Alarma alarm = new Alarma();
public void Encendido(){
        enc.encendidoApagado(1);
}
public void Apagado(){
    enc.encendidoApagado(0);
}


public void cambioHoras(){
    incre.incrementoHoras(1);
    
}
public void cambioMin(){
    incre.incrementoMinutos(1);
    
}

public void alarmaActivada(){
    alarm.alarmaActiva();
}

public void alarmaDesactivada(){
    alarm.alarmaDesactivada();
}
}
