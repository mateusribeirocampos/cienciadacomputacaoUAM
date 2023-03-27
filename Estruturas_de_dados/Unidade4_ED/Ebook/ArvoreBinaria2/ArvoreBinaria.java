package Unidade4_ED.Ebook.ArvoreBinaria2;

public class ArvoreBinaria {
    private No raiz; // Referência para o nó raiz da árvore

    private No adicionaNo(No atual, char valor) {
        if (atual == null) { // Caso base: nó atual é nulo, então cria um novo nó com o valor passado
            return new No(valor);
        }

        // Valor a ser inserido é menor que o valor do nó corrente
        if (valor < atual.valor) {
            atual.filhoEsquerda = adicionaNo(atual.filhoEsquerda, valor); // Insere o valor no filho esquerdo do nó
                                                                          // corrente
        } else if (valor > atual.valor) { // Valor a ser inserido é maior que o valor do nó corrente
            atual.filhoDireita = adicionaNo(atual.filhoDireita, valor); // Insere o valor no filho direito do nó
                                                                        // corrente
        } else { // O valor já existe, então não precisa ser inserido novamente
            return atual;
        }
        return atual;
    }

    /*
     * Essa função chama internamente o método adicionaNo, que é responsável por
     * percorrer a árvore de forma recursiva até encontrar a posição adequada para
     * inserir o novo nó. Esse método retorna o nó atualizado após a inserção do
     * novo valor.
     * 
     * A raiz da árvore é atualizada após a inserção do novo nó utilizando a linha
     * de código raiz = adicionaNo(raiz, valor);, onde raiz é a referência para o
     * primeiro nó da árvore.
     */
    public void adiciona(char valor) {
        raiz = adicionaNo(raiz, valor); // Chama o método adicionaNo para inserir o valor na árvore
    }

    private void imprimeEmOrdem(No atual) {
        if (atual != null) {
            // Visita os nós da subárvore esquerda em ordem crescente
            imprimeEmOrdem(atual.filhoEsquerda);
            // Imprime o valor do nó corrente
            System.out.print(atual.valor + " ");
            // Visita os nós da subárvore direita em ordem crescente
            imprimeEmOrdem(atual.filhoDireita);
        }
    }

    private No removeNo(No atual, char valor) {
        if (atual == null) {
            return null; // O nó não existe na árvore
        }

        if (valor < atual.valor) {
            atual.filhoEsquerda = removeNo(atual.filhoEsquerda, valor); // O nó a ser removido está à esquerda
            return atual;
        } else if (valor > atual.valor) {
            atual.filhoDireita = removeNo(atual.filhoDireita, valor); // O nó a ser removido está à direita
            return atual;
        } else { // O nó a ser removido foi encontrado
            if (atual.filhoEsquerda == null) {
                return atual.filhoDireita; // Retorna o filho à direita para substituir o nó atual
            } else if (atual.filhoDireita == null) {
                return atual.filhoEsquerda; // Retorna o filho à esquerda para substituir o nó atual
            } else { // O nó tem dois filhos
                No sucessor = encontraSucessor(atual.filhoDireita); // Encontra o sucessor do nó a ser removido
                atual.valor = sucessor.valor; // Substitui o valor do nó atual pelo valor do sucessor
                atual.filhoDireita = removeNo(atual.filhoDireita, sucessor.valor); // Remove o sucessor da subárvore à
                                                                                   // direita
                return atual;
            }
        }
    }

    public void remove(char valor) {
        raiz = removeNo(raiz, valor); // Chama a função removeNo para remover o nó com o valor especificado da árvore
    }

    private No encontraSucessor(No atual) {
        while (atual.filhoEsquerda != null) { // Continua descendo na subárvore à esquerda até encontrar o nó mais à
                                              // esquerda
            atual = atual.filhoEsquerda;
        }
        return atual;
    }

    public void imprimeEmOrdem() {
        imprimeEmOrdem(raiz); // Chama o método imprimeEmOrdem passando a raiz da árvore como parâmetro
        System.out.println(); // Imprime uma quebra de linha após a impressão dos valores
    }

    public void imprimeArvore() {
        imprimeSubArvore(raiz, ""); // Chama o método imprimeSubArvore passando a raiz como o nó atual e uma string
                                    // vazia como prefixo
    }

    public void imprimePreOrdem() {
        imprimeEmOrdem(raiz);
    }

    private void imprimePreOrdem(No no) {
        if (no != null) {
            System.out.println(no.valor + " ");
            imprimePreOrdem(no.filhoEsquerda);
            imprimePreOrdem(no.filhoEsquerda);
        }
    }

    private void imprimeSubArvore(No atual, String prefixo) {
        if (atual == null) { // Caso base: se o nó atual é nulo, não há mais nós para imprimir, então retorna
            return;
        }

        boolean temFilhoEsquerda = (atual.filhoEsquerda != null); // Verifica se há um filho à esquerda do nó atual
        boolean temFilhoDireita = (atual.filhoDireita != null); // Verifica se há um filho à direita do nó atual

        if (!temFilhoEsquerda && !temFilhoDireita) { // Se o nó atual não tiver filhos, imprime o valor do nó com o
                                                     // prefixo
            System.out.println(prefixo + "+-- " + atual.valor);
            return; // Retorna pois não há mais nós para imprimir abaixo deste nó
        }

        System.out.println(prefixo + "+-- " + atual.valor); // Imprime o valor do nó atual com o prefixo

        if (temFilhoEsquerda) { // Se houver filho à esquerda, chama o método imprimeSubArvore recursivamente
                                // passando o filho esquerdo como o nó atual e um prefixo modificado
            imprimeSubArvore(atual.filhoEsquerda, prefixo + (temFilhoDireita ? "|   " : "    "));
        }

        if (temFilhoDireita) { // Se houver filho à direita, chama o método imprimeSubArvore recursivamente
                               // passando o filho direito como o nó atual e um prefixo modificado
            imprimeSubArvore(atual.filhoDireita, prefixo + "    ");
        }
    }
}