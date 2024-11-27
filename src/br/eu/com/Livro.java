package br.eu.com;

public class Livro implements Calculavel {

    public double calcularPrecoFinal(double preco) {
        return preco * 0.9;
    }
}

