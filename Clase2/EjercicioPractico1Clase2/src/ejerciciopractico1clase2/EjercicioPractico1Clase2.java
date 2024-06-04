/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico1clase2;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class EjercicioPractico1Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa que le solicite al usuario el número de día y le indique el nombre del día
        
        //Input para el user
        String dia = JOptionPane.showInputDialog("Digite el numero del dia deseado");
        
        //Logica
        switch(dia){
            case "1":
                JOptionPane.showMessageDialog(null, "El dia escogido es Lunes");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "El dia escogido es Martes");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "El dia escogido es Miercoles");
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "El dia escogido es Jueves");
                break;
            case "5":
                JOptionPane.showMessageDialog(null, "El dia escogido es Viernes");
                break;
            case "6":
                JOptionPane.showMessageDialog(null, "El dia escogido es Sabado");
                break;
            case "7":
                JOptionPane.showMessageDialog(null, "El dia escogido es Domingo");
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Numero invalido, elija uno entre 1 y 7.");
                break;
                
        }
    }
    
}
