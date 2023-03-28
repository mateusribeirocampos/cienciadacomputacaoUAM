package atividade4;

class Pessoa {
    // Declaração das variáveis privadas da classe Pessoa
    private String textoPergunta;
    private String[] opcoesRespostas;
    private String[] dicasParaRespostas;
    private Pergunta noFilhoEsquerda;
    private Pergunta noFilhoDireita;

    public Pessoa(String textoPergunta, String[] opcoesRespostas, String[] dicasParaRespostas, Pergunta noFilhoEsquerda,
            Pergunta noFilhoDireita) {
        this.textoPergunta = textoPergunta;
        this.opcoesRespostas = opcoesRespostas;
        this.dicasParaRespostas = dicasParaRespostas;
        this.noFilhoEsquerda = null;
        this.noFilhoDireita = null;
    }

    /*
     * public void adicionarResposta(String resposta, String dica) {: essa é a assinatura do método, que recebe como parâmetros uma resposta e uma dica. Esse método é usado para adicionar uma nova resposta e dica à pergunta.
     * String[] novasRespostas = new String[opcoesRespostas.length + 1];: cria um novo array de Strings chamado novasRespostas, com um tamanho maior do que o array opcoesRespostas atual, para armazenar a nova resposta.
     * String[] novasDicas = new String[dicasParaRespostas.length + 1];: cria um novo array de Strings chamado novasDicas, com um tamanho maior do que o array dicasParaRespostas atual, para armazenar a nova dica.
     * for (int i = 0; i < opcoesRespostas.length; i++) {: um laço for que itera através do array opcoesRespostas, copiando seus valores para o novo array novasRespostas.
     * novasRespostas[i] = opcoesRespostas[i];: copia o valor de opcoesRespostas[i] para novasRespostas[i].
     * novasDicas[i] = dicasParaRespostas[i];: copia o valor de dicasParaRespostas[i] para novasDicas[i].
     * novasRespostas[novasRespostas.length - 1] = resposta;: adiciona a nova resposta ao final do novo array novasRespostas.
     * novasDicas[novasDicas.length - 1] = dica;: adiciona a nova dica ao final do novo array novasDicas.
     * opcoesRespostas = novasRespostas;: substitui o array opcoesRespostas atual pelo novo array novasRespostas.
     * dicasParaRespostas = novasDicas;: substitui o array dicasParaRespostas atual pelo novo array novasDicas.
     */
    public void adicionarResposta(String resposta, String dica) {
        // Criando dois novos arrays com um tamanho maior que os atuais
        String[] novasRespostas = new String[opcoesRespostas.length + 1];
        String[] novasDicas = new String[dicasParaRespostas.length + 1];

        // Copiando os valores dos arrays atuais para os novos arrays
        for (int i = 0; i < opcoesRespostas.length; i++) {
            novasRespostas[i] = opcoesRespostas[i];
            novasDicas[i] = dicasParaRespostas[i];
        }

        // Adicionando a nova resposta e a nova dica nos novos arrays
        novasRespostas[novasRespostas.length - 1] = resposta;
        novasDicas[novasDicas.length - 1] = dica;

        // Substituindo os arrays atuais pelos novos arrays
        opcoesRespostas = novasRespostas;
        dicasParaRespostas = novasDicas;
    }

    // Método para imprimir os dados da pessoa
    public void imprimirDados() {
        // Imprime o texto da pergunta
        System.out.println("Texto da pergunta: " + this.textoPergunta);

        // Imprime as opções de respostas disponíveis
        System.out.println("Opções de respostas: ");
        for (String resposta : this.opcoesRespostas) {
            System.out.println("- " + resposta);
        }

        // Imprime as dicas para as respostas disponíveis
        System.out.println("Dicas para as respostas: ");
        for (String dica : this.dicasParaRespostas) {
            System.out.println("- " + dica);
        }

        // Imprime o nó filho esquerda
        System.out.println("Nó filho esquerda: " + this.noFilhoEsquerda);

        // Imprime o nó filho direita
        System.out.println("Nó filho direita: " + this.noFilhoDireita);
    }

    public boolean NoVazio(){
        if(opcoesRespostas == null || opcoesRespostas.length == 0){
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    // Métodos getter e setter para cada variável
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
