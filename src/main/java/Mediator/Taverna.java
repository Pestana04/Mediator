package Mediator;

public class Taverna implements Setor {

    private static Taverna instancia = new Taverna();

    private Taverna() {}

    public static Taverna getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Taverna vai melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Taverna agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Taverna vai analisar a sugestão: " + mensagem;
    }
}