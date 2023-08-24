package br.com.alura.ManuVideo.modelos;
import br.com.alura.ManuVideo.calculo.classificacao;

public class Episodio implements classificacao {
    private int numero;
    private String nome;
    private Serie serie;
    private int totaVisuaizacoes;

    public int getTotaVisuaizacoes() {
        return totaVisuaizacoes;
    }

    public void setTotaVisuaizacoes(int totaVisuaizacoes) {
        this.totaVisuaizacoes = totaVisuaizacoes;
    }

    public int getNumero() {

        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificao() {
        if(totaVisuaizacoes > 100){
            return 4;
        }else{
        return 2;}
    }
}
