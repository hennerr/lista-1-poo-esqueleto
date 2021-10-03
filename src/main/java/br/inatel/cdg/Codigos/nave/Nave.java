package br.inatel.cdg.algebra.nave;

import java.sql.SQLOutput;

public class Nave {
    private String nome;
    private int vida;
    public Nave(){

        this.nome = "Nave";
        this.vida = 100;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public static class Principal{
        public static void main(String args[]){
            Nave n1 = new Nave();
            Nave n2 = new Nave();
            if(n1 == n2)
                n1.setVida(35);
            else
                n2.setVida(40);
            n1 = n2;

            System.out.println(n2.getVida() + " " + n1.getVida());
        }
    }
}
