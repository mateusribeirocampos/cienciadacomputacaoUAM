package unidade4_ed.ebook.arvorebinaria;

public class NoFruta {
    // Define os atributos da classe NoFruta, que serão a fruta e seus filhos à esquerda e à direita
    private Fruta fruta;
    private NoFruta frutaEsquerda;
    private NoFruta frutaDireita;

    // Define os métodos getter e setter para a fruta, que permitirão acessar e modificar os dados da fruta
    public Fruta getFruta() {
        return fruta;
    }
    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    // Define os métodos getter e setter para o filho à esquerda, que permitirão acessar e modificar os dados do nó filho à esquerda
    public NoFruta getFrutaEsquerda() {
        return frutaEsquerda;
    }
    public void setFrutaEsquerda(NoFruta frutaEsquerda) {
        this.frutaEsquerda = frutaEsquerda;
    }

    // Define os métodos getter e setter para o filho à direita, que permitirão acessar e modificar os dados do nó filho à direita
    public NoFruta getFrutaDireita() {
        return frutaDireita;
    }
    public void setFrutaDireita(NoFruta frutaDireita) {
        this.frutaDireita = frutaDireita;
    }

    // Define o método frutaVazia, que verifica se o nó atual contém uma fruta
    public boolean frutaVazia() {
        if(fruta == null){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    // Define o método imprimirFruta, que imprime as informações da fruta e seus filhos à direita e à esquerda
    public static void imprimirFruta(NoFruta noFruta) {
        if(noFruta != null) {
            Fruta fruta = noFruta.getFruta();
            System.out.println("Fruta: " + fruta.getNome() + 
            ", cor da fruta: " + fruta.getCor() + 
            " e tipo da fruta: " + fruta.getTipo());
            imprimirFruta(noFruta.getFrutaDireita());
            imprimirFruta(noFruta.getFrutaEsquerda());
        }
    }
}
