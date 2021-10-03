package br.inatel.cdg.Codigos.Pessoa;

public class Principal {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Chavez",12345, 4 ); // Dados do indivíduo.

        // Endereços cadastrados do indivíduo.
        Endereco e1 = new Endereco("Vila Florinda","Centro",10);
        Endereco e2 = new Endereco("Acapulco","Floresta",9);
        Endereco e3 = new Endereco( "Olimpo", "Ceu", 100);
        Endereco e4 = new Endereco( "Xurupitas", "Cordislandia", 20);

        p1.addEndereco(e1);
        p1.addEndereco(e2);
        p1.addEndereco(e3);
        p1.addEndereco(e4);

        // Mostras os endereços cadastrados do indivíduo.
        p1.mostraEnderecos();

    }
}
