package br.com.alura.ManuVideo.Principal;

import br.com.alura.ManuVideo.modelos.Filme;
import br.com.alura.ManuVideo.modelos.Serie;
import br.com.alura.ManuVideo.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        //Filmes---------------------------
        var filme1 = new Filme("O poderoso Chefinho",2017);
        filme1.avalia(9);
        var filme2 = new Filme("Enrolados", 2011);
        filme2.avalia(6);
        var filme3 = new Filme("10 coisas que odeio em você", 1999);
        filme3.avalia(10);

        //Series--------------------------
        var lost = new Serie("Lost",2004);

        //Listas------------------------------------------
        List<Titulo> lista = new LinkedList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme){
                System.out.println("Classificacao " + filme.getClassificao() );
            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Manoel");
        buscaPorArtista.add("Sabrina");
        buscaPorArtista.add("Aline");
        buscaPorArtista.add("Felipe");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenaçao");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
