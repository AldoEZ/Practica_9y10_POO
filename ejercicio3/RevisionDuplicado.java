package mx.unam.fi.poo.g1.p9y10.e3;

import java.util.*;

class RevisionDuplicado {
    public static void checarDuplicado(List<Integer> numeros) throws NumeroDuplicadoException {
        Set<Integer> numerosUnicos = new HashSet<>();
        
        for(int num : numeros) {
            if(numerosUnicos.contains(num)) {
                throw new NumeroDuplicadoException("Numero duplicado encontrado: " + num);
            }
            numerosUnicos.add(num);
        }
    }
}
