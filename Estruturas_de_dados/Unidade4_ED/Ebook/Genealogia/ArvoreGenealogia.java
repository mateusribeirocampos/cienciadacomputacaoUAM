package Unidade4_ED.Ebook.Genealogia;

class ArvoreGenealogia {
    private NoArvore node;
    
    public boolean estaVazia(NoArvore node) {
        if(node == null) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
}
