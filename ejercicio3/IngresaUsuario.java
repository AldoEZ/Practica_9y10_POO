package mx.unam.fi.poo.g1.p9y10.e3;

import java.util.*;

class IngresaUsuario {
    public static List<Integer> leerNumerosUsuario() {
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Cuantos numeros deseas ingresar?");
        int cont = scanner.nextInt();
        
        System.out.println("Ingresa los enteros: ");
        for(int i = 0; i < cont; i++) {
            int num = scanner.nextInt();
            numeros.add(num);
        }
        scanner.close();
        return numeros;
    }
}
