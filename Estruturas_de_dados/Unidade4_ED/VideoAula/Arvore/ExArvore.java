package Unidade4_ED.VideoAula.Arvore;

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
