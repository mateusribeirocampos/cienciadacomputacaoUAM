package GetterSetter;

public class Futebol {
    private String nomeTime;

    public void setTime(String meuTime) {
        nomeTime = meuTime;
    }

    public String getTime() {
        return nomeTime;
    }

    public void mostraTime() {
        System.out.printf("Seu time do coracao e o %s\n", getTime());
    }
}
