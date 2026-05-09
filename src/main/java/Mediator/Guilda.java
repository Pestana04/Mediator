package Mediator;

public class Guilda {

    private static Guilda instancia = new Guilda();

    private Guilda() {}

    public static Guilda getInstancia() {
        return instancia;
    }

    public String receberElogioFerreiro(String mensagem) {
        return "A Guilda agradece seu contato.\n" +
                "O Ferreiro respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Ferreiro.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoFerreiro(String mensagem) {
        return "A Guilda agradece seu contato.\n" +
                "O Ferreiro respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Ferreiro.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoFerreiro(String mensagem) {
        return "A Guilda agradece seu contato.\n" +
                "O Ferreiro respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Ferreiro.getInstancia().receberSugestao(mensagem);
    }

    public String receberElogioCurandeiro(String mensagem) {
        return "A Guilda agradece seu contato.\n" +
                "O Curandeiro respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Curandeiro.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoCurandeiro(String mensagem) {
        return "A Guilda agradece seu contato.\n" +
                "O Curandeiro respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Curandeiro.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoCurandeiro(String mensagem) {
        return "A Guilda agradece seu contato.\n" +
                "O Curandeiro respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Curandeiro.getInstancia().receberSugestao(mensagem);
    }

    public String receberElogioTaverna(String mensagem) {
        return "A Guilda agradece seu contato.\n" +
                "A Taverna respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Taverna.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoTaverna(String mensagem) {
        return "A Guilda agradece seu contato.\n" +
                "A Taverna respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Taverna.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoTaverna(String mensagem) {
        return "A Guilda agradece seu contato.\n" +
                "A Taverna respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Taverna.getInstancia().receberSugestao(mensagem);
    }
}