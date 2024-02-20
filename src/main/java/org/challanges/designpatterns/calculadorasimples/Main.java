package org.challanges.designpatterns.calculadorasimples;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        Operacao adicao = new Adicao();
        Operacao divisao = new Divisao();
        Operacao multiplicacao = new Multiplicacao();
        Operacao subtracao = new Subtracao();

        double numero1 = dadosEntrada.nextDouble();
        double numero2 = dadosEntrada.nextDouble();

        System.out.println("Qual a operação desejada: ");
        String operacaoEscolhida = dadosEntrada.next();

        switch(operacaoEscolhida){
            case "+" -> calculadora.setOperacao(adicao);
            case "*" -> calculadora.setOperacao(multiplicacao);
            case "/" -> calculadora.setOperacao(divisao);
            case "-" -> calculadora.setOperacao(subtracao);
            default -> throw new IllegalArgumentException("Sinal inválido: " + operacaoEscolhida);
        };

        double resultado = calculadora.calcular(numero1, numero2);
        System.out.println(resultado);

    }
}
