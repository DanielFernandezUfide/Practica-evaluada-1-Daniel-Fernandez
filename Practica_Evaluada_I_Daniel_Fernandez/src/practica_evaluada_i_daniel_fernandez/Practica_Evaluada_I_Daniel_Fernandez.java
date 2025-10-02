/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_evaluada_i_daniel_fernandez;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Practica_Evaluada_I_Daniel_Fernandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
        double salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));
        double sem = (salario * 0.0925);
        double ivm = (salario *  0.0508);
        
        double impuesto = 0;
        if (salario > 922000 && salario < 1352000){
            impuesto = ((salario - 922.000)*0.1);
        }else if (salario > 1352000 && salario < 2373000){
            impuesto = ((salario - 1352000)*0.15);
        }else if (salario > 2373000){
            impuesto = ((salario - 2373000)*0.2);
        }else {
            impuesto = 0;
        }
        
        double asociacion = (salario * 0.025);
        double salarioConRebajos = (salario - sem - ivm - impuesto - asociacion);
        
        JOptionPane.showMessageDialog(null, "El salario con rebajos de " + nombre + " " + apellido + " es de: " + salarioConRebajos);
    }
    
}
