package Guia07.actividad5;

import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {
        Persona pe = new Persona();

        pe.setApellido("silva");
        pe.setEdad(19);
        String nombre = pe.getApellido();
        int edad = pe.getEdad();

        JOptionPane.showMessageDialog(null, "los datos ingresados:"
                + "\nEL apellido ingresado es " + nombre
                + "\nLa edad ingresada es " + edad);
    }

}
