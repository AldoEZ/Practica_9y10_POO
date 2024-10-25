package mx.unam.fi.poo.g1.p9y10;

import mx.unam.fi.poo.g1.p9y10.*;

/**
 * Clase principal de Practica 9 y 10
 * @author Aldo Axel Estrada Zacarias
 * @version 24-Octubre-2024
 */

public class Practica9y10 {
    /**
     * *Método main
     * Se ejecuta toda la aplicacion.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        try {
            String cadena1 = "Hola amigo que tal!";
            RevisionVocal.checarVocal(cadena1);
            System.out.println("Si se encontraron vocales en la cadena 1: " + cadena1);
            
            String cadena2 = "DKLSLRYCV";
            RevisionVocal.checarVocal(cadena2);
            System.out.println("Si se encontraron vocales en la cadena 2!");
        } catch (VocalException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
