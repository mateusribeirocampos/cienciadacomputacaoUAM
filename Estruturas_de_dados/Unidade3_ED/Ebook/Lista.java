package Unidade3_ED.Ebook;

class Lista {
    private ItemLista primeiroItem;

    public Lista(ItemLista primeiroItem) {
        this.primeiroItem = null;
    }

    public void adiciona(ItemLista novoItem) {
        if (primeiroItem == null) {
            primeiroItem = novoItem;
        } else {
            ItemLista ultimoItem = encontrarUltimoItem();
            ultimoItem.setProx(ultimoItem);
        }
    }

    private ItemLista encontrarUltimoItem() {
        if (primeiroItem == null) {
            return null;
        } else {
            ItemLista ultimoItem = primeiroItem;
            while (ultimoItem.getProx() != null) {
                ultimoItem = ultimoItem.getProx();
            }
            return ultimoItem;
        }
    }

    public void adiciona(ItemLista novoItem, int posicao) {
        if (posicao == 0) {
            novoItem.setProx(primeiroItem);
            primeiroItem = novoItem;
        } else {
            ItemLista itemAnterior = encontrarItem(posicao - 1);
            ItemLista itemAtual = itemAnterior.getProx();
            itemAnterior.setProx(novoItem);
            novoItem.setProx(itemAtual);
        }
    }

    private ItemLista encontrarItem(int posicao) {
        if (primeiroItem == null) {
            return null;
        } else {
            ItemLista itemAtual = primeiroItem;
            for (int i = 0; i < posicao; i++) {
                if (itemAtual.getProx() == null) {
                    return null;
                }
                itemAtual = itemAtual.getProx();
            }
            return itemAtual;
        }
    }

    public void remove(ItemLista itemParaRetirar) {
        if (primeiroItem == null) {
            throw new RuntimeException("Lista vazia!");
        }
        if (primeiroItem == itemParaRetirar) {
            primeiroItem = primeiroItem.getProx();
            itemParaRetirar.setProx(null);
        } else {
            ItemLista itemAterior = primeiroItem;
            while (itemAterior.getProx() != itemParaRetirar) {
                itemAterior = itemAterior.getProx();
                if (itemAterior == null) {
                    throw new RuntimeException("Item nao encontrado!");
                }
            }
            itemAterior.setProx(itemParaRetirar.getProx());
            itemParaRetirar.setProx(itemAterior);
        }
    }

    public void ler(int posicao) {
        ItemLista item = get(posicao);
        System.out.println(item.getInfo());
    }

    public ItemLista get(int posicao) {
        if (primeiroItem == null) {
            throw new IndexOutOfBoundsException("Lista vazia!");
        }
        if (posicao < 0) {
            throw new IndexOutOfBoundsException("Posicao invalida!");
        }
        ItemLista itemAtual = primeiroItem;
        for (int i = 0; i < posicao; i++) {
            if (itemAtual.getProx() == null) {
                throw new IndexOutOfBoundsException("Posicao invalida!");
            }
            itemAtual = itemAtual.getProx();
        }
        return itemAtual;
    }

    public int tamanhoLista() {
        int tamanho = 0;
        ItemLista itemAtual = primeiroItem;
        while (itemAtual != null) {
            tamanho++;
            itemAtual = itemAtual.getProx();
        }
        return tamanho;
    }

    public boolean contem(ItemLista itemBuscado) {
        ItemLista itemAtual = primeiroItem;
        while (itemAtual != null) {
            if (itemAtual == itemBuscado) {
                return true;
            }
            itemAtual = itemAtual.getProx();
        }
        return false;
    }

}