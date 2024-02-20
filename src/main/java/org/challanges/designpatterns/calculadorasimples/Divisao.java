package org.challanges.designpatterns.calculadorasimples;

public class Divisao implements Operacao{

    @Override
    public double calculaResultado(double numeroA, double numeroB) {
        if(numeroB == 0){
            throw new ArithmeticException("Divisão por zero não pode ser permitida");
        }
        return numeroA / numeroB;
    }
}
