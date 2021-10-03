package br.inatel.cdg.algebra.nave2;

import java.sql.SQLOutput;

public class Nave {
    public int cont =0;
    private int vida;
    public Nave (){
        this.vida = 100;
        cont++;
    }
    public void mostraInfo(){
        System.out.println(vida);
    }
    public void trocaVida(Nave nave){
        this.vida = nave.getVida();
        nave.setVida(this.vida);
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public static class Main{
        public static void main(String args[]){
            Nave n1 = new Nave();
            Nave n2 = new Nave();
            Nave n3 = new Nave();
            n3.setVida(250);

            n2.trocaVida(n3);
            System.out.println(n2.cont);
            n1.mostraInfo();
            n2.mostraInfo();
        }
    }
}
