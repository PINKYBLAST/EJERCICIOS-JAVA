/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico2;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class EjercicioPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*  un programa que pida el nombre del trabajador / salario semanal, 
            con esta información calcule salario mensual bruto /deducciones de un 9.34% y salario Neto
        
                    Estimado <<nombre>>, el salario de este mes se desglosa de la siguiente manera.                   
                    siguiente manera.
                    Salario bruto: #####.##
                    Deducciones: #####.##
                    Salario Neto: #####.## 
        */
        
        //Preguntas al Usuario
        
        String nombreAsalariado = JOptionPane.showInputDialog("Por favor ingrese su nombre");
        Double salarioSemanal = Double.parseDouble(JOptionPane.showInputDialog("Indique el salario que gana por semana"));

        //Operaciones
        Double salarioBruto = salarioSemanal * 4;
        Double deducciones = salarioBruto * 0.0934;
        Double salarioNeto = salarioBruto - deducciones;

        //Respuesta al user
        JOptionPane.showMessageDialog(null, "Estimado " + nombreAsalariado + ", el salario de este mes se desglosa de la\nsiguiente manera: "
                + "\nSalario Bruto: " + salarioBruto
                + "\nDeducciones: " + deducciones
                + "\nSalario Neto: " + salarioNeto);
    }
}
       
    
