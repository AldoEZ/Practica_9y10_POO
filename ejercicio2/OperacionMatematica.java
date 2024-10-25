package mx.unam.fi.poo.g1.p9y10.e2;

import mx.unam.fi.poo.g1.p9y10.e2.RaizNegativaException;

class OperacionMatematica {
    public double raizCuadrada(double numero) throws RaizNegativaException {
        if(numero < 0) {
            throw new RaizNegativaException("No se puede calcular una raiz negativa...");
        }
        return Math.sqrt(numero);
    }
}
