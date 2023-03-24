package Unidade4_ED.Ebook.ArvoreBinaria2;

public class MainBinaria {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria(); // Cria um novo objeto ArvoreBinaria
        // Insere os nós {F, D, B, A, C, E, G} na ordem inversa
        arvore.adiciona('F');
        arvore.adiciona('D');
        arvore.adiciona('B');
        arvore.adiciona('A');
        arvore.adiciona('C');
        arvore.adiciona('E');
        arvore.adiciona('F');
       
        arvore.imprimeEmOrdem(); // Imprime os valores dos nós em ordem crescente (A C R S X Z)
        arvore.imprimeArvore(); //Visualmente fica mais fácil de ver os Pai e filhos

        arvore.remove('G');

        arvore.imprimeEmOrdem(); // Imprime os valores dos nós em ordem crescente (A C R S X Z)
        arvore.imprimeArvore(); //Visualmente fica mais fácil de ver os Pai e filhos
        

        arvore.remove('F');

        arvore.imprimeEmOrdem(); // Imprime os valores dos nós em ordem crescente (A C R S X Z)
        arvore.imprimeArvore(); //Visualmente fica mais fácil de ver os Pai e filhos

        arvore.imprimePreOrdem();
    }
}
