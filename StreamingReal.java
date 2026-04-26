class StreamingReal implements Streaming {
    private String nomeFilme;

    public StreamingReal(String nomeFilme) {
        this.nomeFilme = nomeFilme;
        carregarFilme();
    }

    private void carregarFilme() {
        System.out.println("Carregando filme: " + nomeFilme);
    }

    public void assistirFilme(String nome) {
        System.out.println("Reproduzindo filme: " + nome);
    }
}
