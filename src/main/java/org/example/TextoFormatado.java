package org.example;

public class TextoFormatado {

    private String conteudo;
    private EstiloDeTexto estiloDeTexto;

    public TextoFormatado(String conteudo, EstiloDeTexto estiloDeTexto) {
        this.conteudo = conteudo;
        this.estiloDeTexto = estiloDeTexto;
    }

    public String obterTextoFormatado() {
        return "TextoFormatado{" +
                "conteudo='" + conteudo + '\'' +
                ", estilo='" + estiloDeTexto.getEstilo() + '\'' +
                '}';
    }
}
