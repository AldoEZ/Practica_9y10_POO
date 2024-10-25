package mx.unam.fi.poo.g1.p9y10.e2;

import mx.unam.fi.poo.g1.p9y10.e2.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        OperacionMatematica operacion = new OperacionMatematica();
        try {
            double resultado = operacion.raizCuadrada(-9);
            System.out.println("Resultado: " + resultado);
        } catch (RaizNegativaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
