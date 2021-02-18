import processing.core.PApplet;

class Griglia {
    private float altezza, larghezza;
    private int righe, colonne;
    private ListaQuadretti lista;
    private PApplet applet;

    public Griglia(PApplet applet, float altezza, float larghezza, int righe, int colonne) {
        this.applet=applet;
        this.altezza=altezza;
        this.larghezza=larghezza;
        this.righe=righe;
        this.colonne=colonne;
        this.lista=new ListaQuadretti(this);
    }

    public float larghezzaQuadretto() {
        return larghezza / colonne;
    }

    public float altezzaQuadretto() {
        return altezza / righe;
    }

    public void disegna() {
        float lq = larghezzaQuadretto();
        float hq = altezzaQuadretto();

        // disegna griglia
        for(int i=0; i<=righe; i++) {
            applet.line(0, hq*i, larghezza, hq*i);
        }
        for(int i=0; i<=colonne; i++) {
            applet.line(lq*i, 0, hq*i, altezza);
        }
        lista.disegna();
    }

    public void disegnaQuadretto(Quadretto q){
        float hq = this.altezzaQuadretto();
        float lq = this.larghezzaQuadretto();

        applet.rect(q.getC()*lq, q.getR()*hq, lq, hq);
        applet.fill(0xff000000);
    }

    public void clickMouse(float x, float y){
        int r= (int)(y*this.getRighe()/this.getAltezza());
        int c= (int)(x*this.getColonne()/this.getAltezza());
        Quadretto q=new Quadretto(r, c);
        lista.aggiungiQuadretto(q);
    }

    public float getLarghezza() {
        return larghezza;
    }

    public float getAltezza() {
        return altezza;
    }

    public int getColonne() {
        return colonne;
    }

    public int getRighe() {
        return righe;
    }
}