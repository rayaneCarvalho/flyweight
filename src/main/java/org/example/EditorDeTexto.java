package org.example;

import java.util.ArrayList;
import java.util.List;

public class EditorDeTexto {

    private List<TextoFormatado> textos = new ArrayList<>();

    public void adicionarTexto(String conteudo, String estilo) {
        EstiloDeTexto estiloDeTexto = EstiloDeTextoFactory.getInstance().getEstilo(estilo);
        TextoFormatado textoFormatado = new TextoFormatado(conteudo, estiloDeTexto);
        textos.add(textoFormatado);
    }

    public List<String> obterTextos() {
        List<String> saida = new ArrayList<>();
        for (TextoFormatado texto : this.textos) {
            saida.add(texto.obterTextoFormatado());
        }
        return saida;
    }
}

