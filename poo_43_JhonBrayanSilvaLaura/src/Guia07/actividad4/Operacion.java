package Guia07.actividad4;

public class Operacion {

    int resta;
    int suma;
    int division;
    int multiplicacion;

    public void sumar(int a, int b) {
        resta = a + b;
    }

    public void restar(int a, int b) {
        resta = a - b;
    }

    public void division(int a, int b) {
        resta = a + b;
    }

    public void multiplicacion(int a, int b) {
        resta = a + b;
    }

    public void mostrarDatos() {
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicacion es " + multiplicacion);
        System.out.println("La division es " + division);
    }
}
