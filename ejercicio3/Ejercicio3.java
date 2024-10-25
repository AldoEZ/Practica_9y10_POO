package mx.unam.fi.poo.g1.p9y10.e3;

import mx.unam.fi.poo.g1.p9y10.e3.*;
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            List<Integer> numeros = IngresaUsuario.leerNumerosUsuario();
            RevisionDuplicado.checarDuplicado(numeros);
            System.out.println("¡No hay numeros duplicados!");
        } catch (NumeroDuplicadoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
