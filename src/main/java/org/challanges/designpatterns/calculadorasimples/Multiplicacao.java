package org.challanges.designpatterns.calculadorasimples;

public class Multiplicacao implements Operacao{

    @Override
    public double calculaResultado(double numeroA, double numeroB) {
        return numeroA * numeroB;
    }
}
