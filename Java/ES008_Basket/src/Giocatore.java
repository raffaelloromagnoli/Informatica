public class Giocatore {
    private String nome;
    private int punteggio;
    private int eta;

    public Giocatore(String none, int punteggio, int eta) {
        this.nome = none;
        this.punteggio = punteggio;
        this.eta = eta;
    }

    public Giocatore(String nome, int eta){
        this(nome, 0, eta);
    }

    public String getNome() {
        return nome;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) throws Exception {
        if(eta<0){
            throw new Exception("età non valida");
        }
        this.eta=eta;
    }

    @Override
    public String toString() {
        return nome +" " + eta + " / " + punteggio;
    }
}
