/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class EjercicioPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //NUMERO3
        
        //VALORES A INGRESAR
        int primerNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
        int segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
        int tercerNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el tercero numero"));
        int cuartoNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el cuarto numero"));
        
        //RESULTADO DE SUMA
        int resultado = primerNumero+segundoNumero+tercerNumero+cuartoNumero;
        int promedio = resultado/4;

        //SUMA DE ELLOS, RESULTADO Y PROMEDIO
        JOptionPane.showMessageDialog(null,"tus numeros fueron: \n"+ primerNumero+"\n"+segundoNumero+"\n"+tercerNumero+"\n"+cuartoNumero+"\n" + "La suma de los numeros ingresados es equivalente a " + resultado + " y el promedio respectivo es de "+ promedio);
        
    }
    
}
