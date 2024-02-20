package org.challanges.designpatterns.calculadorasimples;

public class Calculadora {
    private Operacao operacao;

    public void setOperacao(Operacao operacao){
        this.operacao = operacao;
    }
    public double calcular(double numero1, double numero2){
        if(operacao == null){
            throw new IllegalStateException("Operação indefinida");
        }
        return operacao.calculaResultado(numero1, numero2);
    }
}
