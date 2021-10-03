package br.inatel.cdg.Codigos.Pessoa;

public class Endereco {

    private String rua; // Nome da Rua.
    private String bairro; // Nome do bairro.
    private int numero; // Número da casa.

    // Declarando o consultor para Rua, bairro e número relacionado ao endereço do indivíduo.
    public Endereco(String rua, String bairro, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }
    // Getter e Setter

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
