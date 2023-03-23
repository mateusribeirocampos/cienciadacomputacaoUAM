package Unidade4_ED.Arvore;

public class MainNo {
    public static void main(String[] args) {
        //Dados C, B, F, A, G e E
        NodaArvore c = new NodaArvore();
        NodaArvore b = new NodaArvore();
        NodaArvore f = new NodaArvore();
        NodaArvore a = new NodaArvore();
        NodaArvore g = new NodaArvore();
        NodaArvore e = new NodaArvore();
        
        c.setDado("C");
        b.setDado("B");
        f.setDado("F");
        a.setDado("A");
        g.setDado("G");
        e.setDado("E");
        
        c.setEsquerdo(f);
        c.setDireito(b);
        
        f.setDireito(g);
        f.setEsquerdo(e);
        
        b.setEsquerdo(a);
        
        ExArvore.imprimir(c);
    }
}
