package unidade4_ed.videoaula.Arvore;

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
