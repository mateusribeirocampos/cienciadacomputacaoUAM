package Unidade4_ED.Arvore;

class NodaArvore {
    private String dado;
    private NodaArvore esquerdo;
    private NodaArvore direito;
    
    public String getDado() {
        return dado;
    }
    public void setDado(String dado) {
        this.dado = dado;
    }

    public NodaArvore getEsquerdo() {
        return esquerdo;
    }
    public void setEsquerdo(NodaArvore esquerdo) {
        this.esquerdo = esquerdo;
    }

    public NodaArvore getDireito() {
        return direito;
    }
    public void setDireito(NodaArvore direito) {
        this.direito = direito;
    }
}
