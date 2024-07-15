package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class EditorDeTextoTest {

    @Test
    void deveRetornarTextosFormatados() {
        EditorDeTexto editor = new EditorDeTexto();
        editor.adicionarTexto("Olá Mundo", "Negrito");
        editor.adicionarTexto("Bem-vindo ao Java", "Itálico");
        editor.adicionarTexto("Padrões de Projeto", "Sublinhado");
        editor.adicionarTexto("Design Patterns", "Negrito");

        List<String> saida = Arrays.asList(
                "TextoFormatado{conteudo='Olá Mundo', estilo='Negrito'}",
                "TextoFormatado{conteudo='Bem-vindo ao Java', estilo='Itálico'}",
                "TextoFormatado{conteudo='Padrões de Projeto', estilo='Sublinhado'}",
                "TextoFormatado{conteudo='Design Patterns', estilo='Negrito'}"
        );

        assertEquals(saida, editor.obterTextos());
    }

    @Test
    void deveRetornarTotalEstilos() {
        EditorDeTexto editor = new EditorDeTexto();
        editor.adicionarTexto("Olá Mundo", "Negrito");
        editor.adicionarTexto("Bem-vindo ao Java", "Itálico");
        editor.adicionarTexto("Padrões de Projeto", "Sublinhado");
        editor.adicionarTexto("Design Patterns", "Negrito");

        assertEquals(3, EstiloDeTextoFactory.getInstance().getTotalEstilos());
    }
}
