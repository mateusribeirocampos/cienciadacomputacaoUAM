package u4pooebook;

public class CaixaDeSom {
    private boolean status;
    private int tamanho;
    private double potencia;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    //Metodo constudor
    public CaixaDeSom(int tamanho, double potencia) {
        this.status = false;
        this.tamanho = tamanho;
        this.potencia = potencia;
    }
    
    public boolean ligar(boolean b) {
        status = b;
        return status;
    }
    
    public boolean desligar(boolean b) {
        status = b;
        return status;
    }
}
