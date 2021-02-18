public class Principale {

    private Libro libro;
    private CLInpt cli;

    Principale(){
        this.cli= new CLInput();
    }


    public void leggi(){
        String titolo;
        String autore;
        int pagine;



        try {
            titolo=cli.readString("Inserisci il titolo: ");
            autore=cli.readString("Inserisci il autore: ");
            pagine=cli.readInt("Inserisci il pagine: ");
            this.libro=new Libro(titolo, autore, pagine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
