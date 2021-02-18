public class ColpisciBersaglio {
    public static final int NUM_MAX=100;
    private Bersaglio[] bersagli;
    private int quanti;
    private int punteggioTot;

    public ColpisciBersaglio() {
        this.bersagli = new Bersaglio[NUM_MAX];
        this.quanti=0;
        this.punteggioTot=0;
    }

    public int getPunteggioTot() {
        return punteggioTot;
    }

    public void aggiungiBersaglio(Bersaglio b) throws Exception {

        if(quanti>=NUM_MAX||b==null){
            throw new Exception("Impossibile aggiungere bersaglio");
        }
        bersagli[quanti]=b;
        quanti++;
    }

    public void spara(float mx, float my){
        int i=0;
        boolean colpito=false;
        while (i<quanti && colpito==false){
            if(bersagli[i].colpito(mx, my)){
                punteggioTot+=bersagli[i].getPunteggio();
                colpito=true;
            }
            i++;
        }
    }
}
