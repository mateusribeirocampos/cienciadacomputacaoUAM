package Unidade4_ED.Ebook.ArvoreBinaria;

public class NoFruta {
    private Fruta fruta;
    private NoFruta frutaEsquerda;
    private NoFruta frutaDireita;

    public Fruta getFruta() {
        return fruta;
    }
    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public NoFruta getFrutaEsquerda() {
        return frutaEsquerda;
    }
    public void setFrutaEsquerda(NoFruta frutaEsquerda) {
        this.frutaEsquerda = frutaEsquerda;
    }

    public NoFruta getFrutaDireita() {
        return frutaDireita;
    }
    public void setFrutaDireita(NoFruta frutaDireita) {
        this.frutaDireita = frutaDireita;
    }

    public boolean frutaVazia() {
        if(fruta == null){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
    
}
