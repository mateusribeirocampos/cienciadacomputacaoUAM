package Atividade4;

class Pessoa {
    private String textoPergunta;
    private String[] opcoesRespostas;
    private String[] dicasParaRespostas;
    private Pergunta noFilhoEsquerda;
    private Pergunta noFilhoDireita;

    //Metodo getter e setter
    public String getTextoPergunta() {
        return textoPergunta;
    }
    public void setTextoPergunta(String textoPergunta) {
        this.textoPergunta = textoPergunta;
    }

    public String[] getOpcoesRespostas() {
        return opcoesRespostas;
    }
    public void setOpcoesRespostas(String[] opcoesRespostas) {
        this.opcoesRespostas = opcoesRespostas;
    }

    public String[] getDicasParaRespostas() {
        return dicasParaRespostas;
    }
    public void setDicasParaRespostas(String[] dicasParaRespostas) {
        this.dicasParaRespostas = dicasParaRespostas;
    }

    public Pergunta getNoFilhoEsquerda() {
        return noFilhoEsquerda;
    }
    public void setNoFilhoEsquerda(Pergunta noFilhoEsquerda) {
        this.noFilhoEsquerda = noFilhoEsquerda;
    }

    public Pergunta getNoFilhoDireita() {
        return noFilhoDireita;
    }
    public void setNoFilhoDireita(Pergunta noFilhoDireita) {
        this.noFilhoDireita = noFilhoDireita;
    }    
}
