import br.com.alura.ManuVideo.calculo.CalculadoraDeTempo;
import br.com.alura.ManuVideo.calculo.FiltroRecomendacao;
import br.com.alura.ManuVideo.modelos.Episodio;
import br.com.alura.ManuVideo.modelos.Filme;
import br.com.alura.ManuVideo.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso Chefinho");
        meuFilme.setAnoDeLancamento(2017);
        meuFilme.setDuracao(97);



        meuFilme.exibeFichaTecnica();
        meuFilme.avalia( 8);
        meuFilme.avalia( 10);
        meuFilme.avalia(9);
        meuFilme.avalia(7);
        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setMinutosPorEpisodio(50);
        lost.setEpsPorTemporada(10);
        System.out.println("Duração para maratonar Lost " + lost.getDuracao());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println("tempo" + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotaVisuaizacoes(-3);
        filtro.filtra(episodio);
    }
}
