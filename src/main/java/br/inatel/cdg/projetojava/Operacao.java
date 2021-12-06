package br.inatel.cdg.projetojava;

enum Operacao {
    ADICAO("adição", "+") {
        @Override
        double executar(double a, double b) {
            return a + b;
        }
    },

    SUBTRACAO("subtração", "-") {
        @Override
        double executar(double a, double b) {
            return a - b;
        }
    },

    MULTIPLICACAO("multiplicação", "*") {
        @Override
        double executar(double a, double b) {
            return a * b;
        }
    },

    DIVISAO("divisão", "/") {
        @Override
        double executar(double a, double b) {
            return a / b;
        }
    };

    final String nome;
    final String operador;

    private Operacao(String nome, String operador) {
        this.nome = nome;
        this.operador = operador;
    }

    static String[] operadores() {
        Operacao[] operacoes = values();
        int qtd = operacoes.length;
        String[] operadores = new String[qtd];
        for (int i = 0; i < qtd; i++) {
            operadores[i] = operacoes[i].operador;
        }
        return operadores;
    }

    static Operacao porOperador(String operador) {
        for (Operacao operacao : values()) {
            if (operacao.operador.equals(operador)) {
                return operacao;
            }
        }
        return null;
    }

    abstract double executar(double a, double b);
}