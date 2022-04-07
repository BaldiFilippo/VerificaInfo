import java.io.BufferedWriter;


public class Normali extends Prodotti {

    private boolean riciclabile;

    public Normali(String codiceBarre, double prezzo, String descrizione, boolean riciclabile) {
        super(codiceBarre, prezzo, descrizione);
        this.riciclabile = riciclabile;
    }

    public Normali() {
    }

    public boolean isRiciclabile() {
        return riciclabile;
    }

    public void setRiciclabile(boolean riciclabile) {
        this.riciclabile = riciclabile;
    }

     @Override
    public void aggiungiLista() {

        try {
            writer = new BufferedWriter(new java.io.FileWriter("/Users/baldi/Desktop/Verifica/es1/src/lista.txt", true));
            writer.write(" Prodotto normale ♻️ " + codiceBarre + " " + prezzo + " " + descrizione + " " + riciclabile);
            writer.newLine();
            writer.close();
        } catch (Exception e) {
            System.out.println("Errore nella scrittura del file");
        }
        
    }

    @Override
    public String toString() {
        return "Oggetto Normale 🪧 :" + "\n" + "codiceBarre: " + codiceBarre + '\n' +
                "prezzo: " + prezzo + "€" + "\n" +
                "descrizione: " + descrizione + '\n'
                + "riciclabile: " + riciclabile + '\n';
    }
    
    public void scontoRicilabile(double prezzo) {
        double sconto = 0;
        if (riciclabile) {
            // 10%
            sconto = prezzo * 0.10;
            System.out.println("Il prodotto è riciclabile!! ulteriore sconto del 10%");
            this.prezzo = prezzo - sconto;
        }
        else {
            System.out.println("Il prodotto non è riciclabile");
        }
    }
    
}
