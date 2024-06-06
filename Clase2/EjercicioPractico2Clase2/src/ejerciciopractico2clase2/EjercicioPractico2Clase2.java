/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico2clase2;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class EjercicioPractico2Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio que solicite> anos de antiguedad / horas laboradas semanalmente / salario hora 
        //Calcular salario bruto / if >10anos * 0.020 de bono y agregarlo al bruto / if bruto+bono > 1000usd, restar 0.010 a bruto / if bruto+bono > 2000usd, restar 0.015 a bruto
        //Mostrar salario neto final
        
        //Preguntas al user
        String nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre");
        Double antiguedad = Double.parseDouble(JOptionPane.showInputDialog("Indique su antiguedad en años(ej, 1.7)\nIMPORTANTE: Utilice unicamente numeros"));
        Double horasSemana = Double.parseDouble(JOptionPane.showInputDialog("Indique las horas laboradas por semana"));
        Double salarioHora = Double.parseDouble(JOptionPane.showInputDialog("Indique su salario hora"));

        //Salario Bruto
        Double salarioBruto = (horasSemana * salarioHora) * 4;

        //Bono por 10 anos antiguedad
        Double bono = 0.1;
        
        if (antiguedad >= 10) {
            bono = salarioBruto * 0.020;
            JOptionPane.showMessageDialog(null, "Gracias por permanecer!\nPor haberte mantenido mas de 10 anos en la compania te corresponde un bono de " + bono);
        }
        //Salario Mas bono
        Double salarioPlusBono = (salarioBruto + bono);
        
        //Deducciones
        //Resta y asignacion
        if (salarioPlusBono > 1000){
            salarioPlusBono -= salarioPlusBono *0.10;
        }
        else if(salarioPlusBono > 2000){
            salarioPlusBono -= salarioPlusBono *0.20;
        }
        
        
        //Salario neto
        JOptionPane.showMessageDialog(null, "Tu salario neto va a ser equivalente a " + salarioPlusBono);
        }
       
        
    }


