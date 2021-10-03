package br.inatel.cdg.algebra.reta;

public class Reta {

    private Ponto p1, p2; // Criando pontos P1 e P2.

    public Reta(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;

    }

    // Calculando o coeficiente angular.
    public double calcCoeficienteangular() {

        double result;
        result = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());

        return result;

    }

    // Calculando o coeficiente linear
    public double calcCoeficientelinear() {

        double result;
        result = p1.getY() - calcCoeficienteangular() * p1.getX();

        return result;

    }

}
