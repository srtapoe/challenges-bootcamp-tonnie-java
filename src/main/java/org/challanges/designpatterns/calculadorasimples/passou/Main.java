package org.challanges.designpatterns.calculadorasimples.passou;

import java.util.Scanner;

interface Operacao {
    double calculaResultado(double numeroA, double numeroB);
}

class Adicao implements Operacao {
    @Override
    public double calculaResultado(double numeroA, double numeroB) {
        return numeroA + numeroB;
    }
}

class Multiplicacao implements Operacao {

    @Override
    public double calculaResultado(double numeroA, double numeroB) {
        return numeroA * numeroB;
    }
}

class Subtracao implements Operacao {
    @Override
    public double calculaResultado(double numeroA, double numeroB) {
        return numeroA - numeroB;
    }
}


class Divisao implements Operacao {

    @Override
    public double calculaResultado(double numeroA, double numeroB) {
        if(numeroB == 0){
            throw new ArithmeticException("Divisão por zero não pode ser permitida");
        }
        return numeroA / numeroB;
    }
}

class Calculadora {
    private Operacao operacao;

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public double calcular(double numero1, double numero2) {
        if (operacao == null) {
            throw new IllegalStateException("Operação indefinida");
        }
        return operacao.calculaResultado(numero1, numero2);
    }
}

public class Main {
    public static void main(String[] args) {
        var dadosEntrada = new Scanner(System.in);

        var calculadora = new Calculadora();
        Operacao adicao = new Adicao();
        Operacao divisao = new Divisao();
        Operacao multiplicacao = new Multiplicacao();
        Operacao subtracao = new Subtracao();

        double numero1 = dadosEntrada.nextDouble();
        double numero2 = dadosEntrada.nextDouble();

        String operacaoEscolhida = dadosEntrada.next();

        switch (operacaoEscolhida) {
            case "+" -> calculadora.setOperacao(adicao);
            case "*" -> calculadora.setOperacao(multiplicacao);
            case "/" -> calculadora.setOperacao(divisao);
            case "-" -> calculadora.setOperacao(subtracao);
            default -> throw new IllegalArgumentException("Sinal inválido: " + operacaoEscolhida);
        }

        double resultado = calculadora.calcular(numero1, numero2);
        System.out.println(resultado);

        }
    }


