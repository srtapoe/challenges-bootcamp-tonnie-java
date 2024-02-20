package org.challanges.designpatterns.calculadorasimples;

public class Adicao implements Operacao{
    @Override
    public double calculaResultado(double numeroA, double numeroB) {
        return numeroA + numeroB;
    }
}
