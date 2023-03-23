package Unidade4_ED.Arvore;

public class ExArvore {
    public static void imprimir(NodaArvore aux) {
        if (aux == null) {
            return;
        }
            System.out.println(aux.getDado());
            imprimir(aux.getDireito());
            imprimir(aux.getEsquerdo());
    }
}
