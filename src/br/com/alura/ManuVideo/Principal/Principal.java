package br.com.alura.ManuVideo.Principal;

import br.com.alura.ManuVideo.calculo.CalculadoraDeTempo;
import br.com.alura.ManuVideo.calculo.FiltroRecomendacao;
import br.com.alura.ManuVideo.modelos.Episodio;
import br.com.alura.ManuVideo.modelos.Filme;
import br.com.alura.ManuVideo.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //FILMES--------------------------------------------
        var filme1 = new Filme("O poderoso Chefinho",2017);
        filme1.setDuracao(97);

        var filme2 = new Filme( "Enrolados", 2011);
        filme2.setDuracao(100);
        filme2.avalia(10);

        var filme3 = new Filme("10 coisas que odeio em você", 1999);
        filme3.setDuracao(97);
        filme3.avalia(10);

        //LISTAS-------------------------------------------
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println(listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(2).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

        //FICHA TECNICA DE FILMES--------------------------
        filme1.exibeFichaTecnica();
        filme1.avalia( 8);
        filme1.avalia( 10);
        filme1.avalia(9);
        filme1.avalia(7);
        System.out.println(filme1.getSomaDasAvaliacoes());
        System.out.println(filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.pegaMedia());

        filme2.exibeFichaTecnica();

        //SERIES---------------------------------------------
        var lost = new Serie("Lost",2004);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setMinutosPorEpisodio(50);
        lost.setEpsPorTemporada(10);
        System.out.println("Duração para maratonar Lost " + lost.getDuracao());

        //CALCULADORA DE TEMPO----------------------------------
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        System.out.println("tempo" + calculadora.getTempoTotal());

        //FILTRO DE RECOMENDACAO--------------------------------
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        // EPISODIOS--------------------------------------------
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotaVisuaizacoes(-3);
        filtro.filtra(episodio);


    }
}
