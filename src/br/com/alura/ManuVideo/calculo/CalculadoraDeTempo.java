package br.com.alura.ManuVideo.calculo;

import br.com.alura.ManuVideo.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

  /*  public void inclui(Filme f){
        this.tempoTotal += f.getDuracao();
    }

    public void inclui(Serie s){
        this.tempoTotal += s.getDuracao();
    }*/


    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracao();
    }
}
