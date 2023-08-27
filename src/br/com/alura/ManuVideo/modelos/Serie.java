package br.com.alura.ManuVideo.modelos;

import java.security.PublicKey;

public class Serie  extends Titulo{


    private int temporadas;
    private  int epsPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;
    //CONSTRUTOR-------------------------------------
    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    //GETTERS

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpsPorTemporada() {
        return epsPorTemporada;
    }


    public boolean isAtiva() {
        return ativa;
    }

    //SETTERS

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpsPorTemporada(int epsPorTemporada) {
        this.epsPorTemporada = epsPorTemporada;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    // SOBRECRESVENDO

    @Override
    public int getDuracao() {
        return temporadas * epsPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}

