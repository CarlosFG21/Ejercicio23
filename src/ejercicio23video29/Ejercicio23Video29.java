/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23video29;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Ejercicio23Video29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         choche2 y = new choche2();
        
        // y.ruedas = 7; // No se puede cambiar el valor de la rueda porque
        //La tenemos en priva y eso no permite cmabiarle el valor
         
        JOptionPane.showMessageDialog(null,"PROGRAMA CARACTERISTICAS AUTOMOVIL");
        
        System.out.println("CARACTERISTICAS AUTOMOVIL");
        
        System.out.println();
        
        System.out.println("EL AUTOMIL TIENE " + y.ancho + "CM DE ANCHO" );
        
        System.out.println("EL AUTOMIL TIENE  " + y.largo + "CM DE LARGO" );
        
        System.out.println("EL AUTOMIL TIENE " + y.motor + " CABALLOS DE FUERZA" );
        
        System.out.println("EL AUTOMIL TIENE " + y.peso + " KG DE PESO" );
        
        System.out.println("EL AUTOMIL TIENE " + y.ruedas + " RUEDAS" );
        
    }
    
}
