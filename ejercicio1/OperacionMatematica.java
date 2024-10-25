package mx.unam.fi.poo.g1.p9y10.e1;

import mx.unam.fi.poo.g1.p9y10.e1.DivisionPorCeroException;

class OperacionMatematica {
    public double dividir(double numerador, double denominador) throws DivisionPorCeroException {
        if(denominador == 0) {
            throw new DivisionPorCeroException("No es posible dividir entre cero...");
        }
        return numerador / denominador;
    }
}
