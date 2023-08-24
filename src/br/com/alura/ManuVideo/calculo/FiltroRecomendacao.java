package br.com.alura.ManuVideo.calculo;

public class FiltroRecomendacao {
    private String recomendacao ;

    public void filtra (classificacao classificacao){
        if (classificacao.getClassificao() >= 4 ){
            System.out.println("Esta entre os preferidos do momento");
        } else if (classificacao.getClassificao() >= 2 ) {
            System.out.println("Esta muito bem avaliado no momento");
        }else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
