public class Libro {

    private String titolo;
    private String autore;
    private int pagine;

    public Libro(String titolo, String autore, int pagine) throws Exception {
        this.setTitolo(titolo);
        this.setAutore(autore);
        this.setPagine(pagine);
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) throws Exception {
        if(titolo==null){
            throw new Exception("Titolo null");
        }
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) throws Exception {
        if(autore==null){
            throw new Exception("Autore null");
        }
        this.autore = autore;
    }

    public int getPagine() {
        return pagine;
    }

    @Override
    public String toString() {
        return "titolo: "+titolo+", autore: "+autore+", pagine: "+pagine;
    }

    public void setPagine(int pagine) throws Exception {
        if (pagine<0){
            throw new Exception("Pagine negative");
        }

        this.pagine = pagine;

    }
}
