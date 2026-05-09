package Mediator;

public class Pessoa {

    public String elogiarFerreiro(String mensagem) {
        return Guilda.getInstancia().receberElogioFerreiro(mensagem);
    }

    public String reclamarFerreiro(String mensagem) {
        return Guilda.getInstancia().receberReclamacaoFerreiro(mensagem);
    }

    public String sugerirFerreiro(String mensagem) {
        return Guilda.getInstancia().receberSugestaoFerreiro(mensagem);
    }

    public String elogiarCurandeiro(String mensagem) {
        return Guilda.getInstancia().receberElogioCurandeiro(mensagem);
    }

    public String reclamarCurandeiro(String mensagem) {
        return Guilda.getInstancia().receberReclamacaoCurandeiro(mensagem);
    }

    public String sugerirCurandeiro(String mensagem) {
        return Guilda.getInstancia().receberSugestaoCurandeiro(mensagem);
    }

    public String elogiarTaverna(String mensagem) {
        return Guilda.getInstancia().receberElogioTaverna(mensagem);
    }

    public String reclamarTaverna(String mensagem) {
        return Guilda.getInstancia().receberReclamacaoTaverna(mensagem);
    }

    public String sugerirTaverna(String mensagem) {
        return Guilda.getInstancia().receberSugestaoTaverna(mensagem);
    }
}