package org.challanges.designpatterns.calculadorasimples;

public class Subtracao implements Operacao{
    @Override
    public double calculaResultado(double numeroA, double numeroB) {
        return numeroA - numeroB;
    }
}
