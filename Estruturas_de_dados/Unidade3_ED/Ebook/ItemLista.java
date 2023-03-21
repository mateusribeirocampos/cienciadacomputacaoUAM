package Unidade3_ED.Ebook;

class ItemLista {
    private String info;
    private ItemLista prox;

    public ItemLista(String info) {
        this.info = info;
        this.prox = null;

    }
        
    public String getInfo() {
        return info;
    }

    public void setProx(ItemLista prox) {
        this.prox = prox;
    }

    public ItemLista getProx() {
        return prox;
    }
}
