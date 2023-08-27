package br.com.alura.ManuVideo.modelos;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private int duracao;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    //CONSTRUTOR------------------------------------
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public double getSomaDasAvaliacoes(){
        return somaDasAvaliacoes;
    }
    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    // FICHA TECNICA DO FILME
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracao + " min");
        System.out.println("Nota: " + somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
    }
    // AVALIAÇÕES
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double pegaMedia (){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
