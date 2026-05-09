package Mediator;

public class Curandeiro implements Setor {

    private static Curandeiro instancia = new Curandeiro();

    private Curandeiro() {}

    public static Curandeiro getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O Curandeiro vai melhorar o atendimento da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O Curandeiro agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O Curandeiro vai analisar a sugestão: " + mensagem;
    }
}