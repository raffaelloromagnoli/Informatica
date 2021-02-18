public class Squadra {
    private static final int NUM_MAX=100;
    private String nome;
    private Giocatore[] giocatori;
    private int quanti;

    public Squadra(String nome, int quanti) {
        this.giocatori = new Giocatore[NUM_MAX];
        this.nome=nome;
        this.quanti=0;

    }

    public void addPlayer(Giocatore g){
        this.giocatori[quanti++]=g;
    }
}
