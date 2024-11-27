package br.eu.com;

public class ProdutoFisico implements Calculavel {
    public double calcularPrecoFinal(double preco) {
        return preco * 1.05;
    }
}
