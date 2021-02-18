public class data {

    private int anno;
    private int mese;
    private int giorno;

    data(int giorno, int mese, int anno) throws Exception {

        this.giorno = giorno;
        this.setMese(mese);
        this.anno= anno;

    }

    public void setMese(int mese) throws Exception {
        if (mese<1||mese>12){
            throw new Exception("Mese non valido!");
        }
        this.mese=mese;
    }

    public int getMese(){
        return this.mese;
    }

}
