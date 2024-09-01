
package Guia07.actividad4;

import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {
    
   int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
   int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
   
   Operacion op = new Operacion();
   
   op.sumar(num, num2);
   op.restar(num, num2);
   op.multiplicacion(num, num2);
   op.division(num, num2);
   op.mostrarDatos();
    }
}
