package br.inatel.cdg.Codigos.Pessoa;

public class Pessoa {

    private String nome; // Nome do indivíduo.
    private int cpf; // CPF do indivíduo.
    private Endereco enderecos[];// Endereços do indivíduo.

    public Pessoa(String nome, int cpf, int qtdEnderecos) { // Declarando o consultor para o nome e  CPF do indivíduo.
        this.nome = nome;
        this.cpf = cpf;
        enderecos = new Endereco[qtdEnderecos];
    }
    // Getter.
    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }
    // Condição para a verificação se temos algum endereço cadastrado naquela posição,
    // caso não haja endereço cadastrado ele irá dar um STOP (Break).
   public void addEndereco(Endereco endereco){

        for (int i = 0; i < enderecos.length; i++){
            if(enderecos[i] == null){
                enderecos[i] = endereco;
                break;
            }

   }
    }
        public void mostraEnderecos(){

            for(Endereco endereco : enderecos ){
                if(endereco ==null)
                    break;
                System.out.println("Rua: " + endereco.getRua() +" Bairro: " + endereco.getBairro() + " Numero: " + endereco.getNumero());
            }
       }
}
