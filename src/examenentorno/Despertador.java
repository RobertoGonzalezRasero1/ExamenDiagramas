/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenentorno;

import javax.swing.JOptionPane;

/**
 *
 * @author rgonzalezrasero
 */
public class Despertador {

    /**
     * @param args the command line arguments
     * 
     * Take 1 option 
     */
    public static void main(String[] args) {
        int Despertador = Integer.parseInt(JOptionPane.showInputDialog("Elige una de las opciones"));
        Display opcio = new Display();
        switch (Despertador) {
            case 1: opcio.Encendido();
                     break;
            case 2:  opcio.Apagado();
                     break;
            case 3:  opcio.cambioHoras();
                     break;
            case 4:  opcio.cambioMin();
                     break;
            case 5:  opcio.alarmaActivada();
                     break;
            case 6:  opcio.alarmaDesactivada();
                     break;
            default: 
                     break;
        
        }
        
    }
    
}
