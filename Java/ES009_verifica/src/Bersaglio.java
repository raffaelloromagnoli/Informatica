public class Bersaglio {

    private float x;
    private float y;
    private int punteggio;
    private float raggio;

    public Bersaglio(float x, float y, int punteggio, float raggio) {

        this.x = x;
        this.y = y;
        this.punteggio = punteggio;

        if (raggio>=0)
        {
            this.raggio = raggio;
        }
        else{
            this.raggio=0;
        }
    }

    public Bersaglio(int punteggio, float raggio) {

        this(0,0,punteggio,raggio);
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public float getRaggio() {
        return raggio;
    }

    @Override //perchè è override di object
    public String toString() {
        return  "x=" + x +
                ", y=" + y +
                ", punteggio=" + punteggio +
                ", raggio=" + raggio;
    }

    public boolean colpito(float mx, float my){

        float dx=x-mx;
        float dy=y-my;
        boolean ris=false;

        if (dx*dx+dy*dy<raggio*raggio){
            ris=true;
        }

        return ris;
    }
}
