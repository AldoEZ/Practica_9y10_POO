package mx.unam.fi.poo.g1.p9y10;

/**
 * Clase RevisionVocal
 * @author Aldo Axel Estrada Zacarias
 * @version 24-Octubre-2024
 */

public class RevisionVocal {
    /**
     * *Metodo checarVocal: 
     * Metodo que revisa una cadena con el fin encontrar una vocal en su interior.
     * @param cadena -> Atributo que da la cadena a revisar.
     * @throws VocalException -> Excepcion que se manda si la cadena no contiene vocales.
     */
    public static void checarVocal(String cadena) throws VocalException {
        String vocales = "AaEeIiOoUu";
        for(int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            
            if(vocales.indexOf(letra) != -1) return;
        }
        throw new VocalException("No se encontraron vocales en la cadena: " + cadena);
    }
    
}
