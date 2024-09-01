package Guia07.actividad3;

import javax.swing.JOptionPane;

public class Operacion {

    double numero = 54;
    double numero2 = 32;
    double resultado;

    public double suma() {
        resultado = numero + numero2;
        JOptionPane.showMessageDialog(null, "la suma es " + resultado);
        return resultado;
    }
    public double resta (){
        resultado = numero - numero2;
        JOptionPane.showMessageDialog(null, "En la resta se obtuvo el siguiente resultado " + resultado);
        return resultado;
    }
    public double multiplicacion(){
        resultado = numero * numero2;
        JOptionPane.showMessageDialog(null, "En la resta se obtuvo el siguiente resultado " + resultado);
        return resultado;
    }
    public double division(){
        resultado = numero / numero2;
        JOptionPane.showMessageDialog(null, "En la division se obtuvo el siguiente resultado " + resultado);
        return resultado;
    }
}
