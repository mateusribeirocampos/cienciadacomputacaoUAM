package unidade3_ed.Ebook.ListaEbook;

class Lista {
    private ItemLista primeiroItem;

    public Lista(ItemLista primeiroItem) {
        this.primeiroItem = null; // Inicializa o primeiro item como null
    }

    public void adiciona(ItemLista novoItem) {
        if (primeiroItem == null) { // Se a lista está vazia
            primeiroItem = novoItem; // O novo item se torna o primeiro da lista
        } else {
            ItemLista ultimoItem = encontrarUltimoItem(); // Encontra o último item da lista
            ultimoItem.setProx(ultimoItem); // Adiciona o novo item ao final da lista
        }
    }

    private ItemLista encontrarUltimoItem() {
        if (primeiroItem == null) {
            return null; // Se a lista está vazia, retorna null
        } else {
            ItemLista ultimoItem = primeiroItem;
            while (ultimoItem.getProx() != null) { // Percorre a lista até encontrar o último item
                ultimoItem = ultimoItem.getProx();
            }
            return ultimoItem;
        }
    }

    public void adiciona(ItemLista novoItem, int posicao) {
        if (posicao == 0) { // Se a posição é 0
            novoItem.setProx(primeiroItem); // O novo item se torna o primeiro da lista
            primeiroItem = novoItem;
        } else {
            ItemLista itemAnterior = encontrarItem(posicao - 1); // Encontra o item anterior à posição
            ItemLista itemAtual = itemAnterior.getProx(); // Encontra o item atual da posição
            itemAnterior.setProx(novoItem); // O novo item é adicionado após o item anterior
            novoItem.setProx(itemAtual); // O item atual é adicionado após o novo item
        }
    }

    private ItemLista encontrarItem(int posicao) {
        if (primeiroItem == null) {
            return null; // Se a lista está vazia, retorna null
        } else {
            ItemLista itemAtual = primeiroItem;
            for (int i = 0; i < posicao; i++) { // Percorre a lista até a posição desejada
                if (itemAtual.getProx() == null) { // Se a posição não existe na lista
                    return null; // Retorna null
                }
                itemAtual = itemAtual.getProx(); // Avança para o próximo item
            }
            return itemAtual;
        }
    }

    public void remove(ItemLista itemParaRetirar) {
        // Verifica se a lista está vazia
        if (primeiroItem == null) {
            throw new RuntimeException("Lista vazia!");
        }
        // Se o item a ser retirado é o primeiro da lista
        if (primeiroItem == itemParaRetirar) {
            // Atribui o próximo item como primeiro item e retira a referência do
            // itemParaRetirar
            primeiroItem = primeiroItem.getProx();
            itemParaRetirar.setProx(null);
        } else {
            // Caso contrário, percorre a lista até encontrar o item anterior ao
            // itemParaRetirar
            ItemLista itemAterior = primeiroItem;
            while (itemAterior.getProx() != itemParaRetirar) {
                itemAterior = itemAterior.getProx();
                // Se chegar ao final da lista e não encontrar o item, lança uma exceção
                if (itemAterior == null) {
                    throw new RuntimeException("Item nao encontrado!");
                }
            }
            // Retira o itemParaRetirar da lista, ligando o item anterior ao seu próximo
            // item
            itemAterior.setProx(itemParaRetirar.getProx());
            // Retira a referência do itemParaRetirar
            itemParaRetirar.setProx(itemAterior);
        }
    }

    public void ler(int posicao) {
        // Recupera o item da lista na posição informada
        ItemLista item = get(posicao);
        // Exibe a informação do item
        System.out.println(item.getInfo());
    }

    public ItemLista get(int posicao) {
        // Verifica se a lista está vazia
        if (primeiroItem == null) {
            throw new IndexOutOfBoundsException("Lista vazia!");
        }
        // Verifica se a posição é válida
        if (posicao < 0) {
            throw new IndexOutOfBoundsException("Posicao invalida!");
        }
        // Percorre a lista até chegar na posição informada
        ItemLista itemAtual = primeiroItem;
        for (int i = 0; i < posicao; i++) {
            // Se chegar ao final da lista e não encontrar a posição, lança uma exceção
            if (itemAtual.getProx() == null) {
                throw new IndexOutOfBoundsException("Posicao invalida!");
            }
            itemAtual = itemAtual.getProx();
        }
        // Retorna o item encontrado na posição informada
        return itemAtual;
    }

    public int tamanhoLista() {
        // Inicializa o tamanho da lista como 0
        int tamanho = 0;
        // Percorre a lista contando o número de itens
        ItemLista itemAtual = primeiroItem;
        while (itemAtual != null) {
            tamanho++;
            itemAtual = itemAtual.getProx();
        }
        // Retorna o tamanho da lista
        return tamanho;
    }

    public boolean contem(ItemLista itemBuscado) {
        // Percorre a lista até encontrar o itemBuscado
        ItemLista itemAtual = primeiroItem;
        while (itemAtual != null) {
            // Se encontrar o itemBuscado, retorna true
            if (itemAtual == itemBuscado) {
                return true;
            }
            itemAtual = itemAtual.getProx();
        }
        // Se não encontrar o itemBuscado, retorna false
        return false;
    }
}