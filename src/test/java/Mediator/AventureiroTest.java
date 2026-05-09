package Mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AventureiroTest {

    @Test
    void deveElogiarFerreiro() {
        Aventureiro aventureiro = new Aventureiro();

        assertEquals(
                "A Guilda agradece seu contato.\n" +
                        "O Ferreiro respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Ferreiro agradece a mensagem: A espada ficou perfeita",
                aventureiro.elogiarFerreiro("A espada ficou perfeita")
        );
    }

    @Test
    void deveReclamarCurandeiro() {
        Aventureiro aventureiro = new Aventureiro();

        assertEquals(
                "A Guilda agradece seu contato.\n" +
                        "O Curandeiro respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Curandeiro vai melhorar o atendimento da reclamação: A poção estava fraca",
                aventureiro.reclamarCurandeiro("A poção estava fraca")
        );
    }

    @Test
    void deveSugerirTaverna() {
        Aventureiro aventureiro = new Aventureiro();

        assertEquals(
                "A Guilda agradece seu contato.\n" +
                        "A Taverna respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Taverna vai analisar a sugestão: Criar quartos para descanso",
                aventureiro.sugerirTaverna("Criar quartos para descanso")
        );
    }
}