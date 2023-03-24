package Unidade4_ED.Ebook.ArvoreBinaria2;

class No {
    char valor;
    No filhoEsquerda;
    No filhoDireita;

    public No(char valor) {
        this.valor = valor; // Inicializa o valor do nó com o valor passado como parâmetro
        filhoEsquerda = null; // Inicializa o filho esquerdo como nulo
        filhoDireita = null; // Inicializa o filho direito como nulo
    }
}