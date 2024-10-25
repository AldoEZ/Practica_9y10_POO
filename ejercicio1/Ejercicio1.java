package mx.unam.fi.poo.g1.p9y10.e1;

import mx.unam.fi.poo.g1.p9y10.e1.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        OperacionMatematica operacion = new OperacionMatematica();
        try {
            double resultado = operacion.dividir(10,0);
            System.out.println("Resultado: " + resultado);
        } catch (DivisionPorCeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
