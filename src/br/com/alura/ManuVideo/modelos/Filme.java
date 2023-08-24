package br.com.alura.ManuVideo.modelos;

import br.com.alura.ManuVideo.calculo.classificacao;

public class Filme extends Titulo implements classificacao {
 private String diretor;
    //GETTERS
    public String getDiretor() {
        return diretor;
    }
    //SETTER
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }



    @Override
    public int getClassificao() {
        return 0;
    }
}
