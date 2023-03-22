// Criação da classe ItemLista
package Unidade3_ED.Ebook.ListaEbook;

// Declaração da classe ItemLista
class ItemLista {
    // Atributos privados da classe
    private String info;
    private ItemLista prox;

    // Construtor da classe, recebe uma string como parâmetro e inicializa os atributos da classe
    public ItemLista(String info) {
        this.info = info;
        this.prox = null;
    }

    // Getter para o atributo info
    public String getInfo() {
        return info;
    }

    // Setter para o atributo prox
    public void setProx(ItemLista prox) {
        this.prox = prox;
    }

    // Getter para o atributo prox
    public ItemLista getProx() {
        return prox;
    }
}
