import java.io.BufferedWriter;




public class Prodotti  {

    protected String codiceBarre;
    protected double prezzo;
    protected String descrizione;

    BufferedWriter writer;

    public Prodotti(String codiceBarre, double prezzo, String descrizione) {
        this.codiceBarre = codiceBarre;

        if (prezzo < 0) {

            System.out.println("Prezzo non valido");
            System.exit(1);
        }
        else {
            this.prezzo = prezzo;
        }
        this.descrizione = descrizione;
    }

    public Prodotti() {
    }

    public String getCodiceBarre() {
        return codiceBarre;
    }

    public void setCodiceBarre(String codiceBarre) {
        this.codiceBarre = codiceBarre;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        if (prezzo < 0) {

            System.out.println("Prezzo non valido");
            System.exit(1);
        }
        else {
            this.prezzo = prezzo;
        }
    }

    public String getDescrizione() {
        return descrizione;
    }


    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


    public void AmazonDiscount(double prezzo) {
        double sconto = 0;
        if (prezzo <= 10) {
            // 5%
            sconto = prezzo * 0.05;
        } else if (prezzo > 10 && prezzo <= 50) {
            // 7%
            sconto = prezzo * 0.07;
        } else {
            // 10%
            sconto = prezzo * 0.10;
        }

        System.out.println("Sconti Amazon discount");

        this.prezzo = prezzo - sconto;

    }
    
    public void aggiungiLista() throws Exception {

        try {
            writer = new BufferedWriter(new java.io.FileWriter("/Users/baldi/Desktop/Verifica/es1/src/lista.txt", true));
            writer.write(" Prodotto non definito " + codiceBarre + " " + prezzo + " " + descrizione);
            writer.newLine();
            writer.close();
        } catch (Exception e) {
            System.out.println("Errore nella scrittura del file");
        }
        
    }


    public String toString() {
        return  "Oggetto 👇🏻:" + "\n" + "codiceBarre: " + codiceBarre + '\n' +
                "prezzo: " + prezzo + "€" + "\n" +
                "descrizione: " + descrizione + '\n' ;
    }
    
}
