package Mediator;

public class Ferreiro implements Setor {

    private static Ferreiro instancia = new Ferreiro();

    private Ferreiro() {}

    public static Ferreiro getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O Ferreiro vai revisar o equipamento da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O Ferreiro agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O Ferreiro vai analisar a sugestão: " + mensagem;
    }
}