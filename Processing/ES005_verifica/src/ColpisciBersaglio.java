import processing.core.PApplet;

public class ColpisciBersaglio {
    public static final int NUM_MAX=100;
    private Bersaglio[] bersagli;
    private int quanti;
    private int punteggioTot;
    private PApplet applet;

    public ColpisciBersaglio(PApplet applet) {
        this.bersagli = new Bersaglio[NUM_MAX];
        this.quanti=0;
        this.punteggioTot=0;
        this.applet=applet;
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
    public void disegna(){
        for (int i=0; i<quanti;i++){
            bersagli[i].disegna();
        }
    }
}
