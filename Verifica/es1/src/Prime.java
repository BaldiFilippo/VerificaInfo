import java.util.Date;

import java.io.BufferedWriter;


public class Prime extends Prodotti {

    // date 
    private Date dataScadenza;


    public Prime(String codiceBarre, double prezzo, String descrizione, Date dataScadenza) {
        super(codiceBarre, prezzo, descrizione);
        this.dataScadenza = dataScadenza;
        
    }

    public Prime() {
    }

    public Date getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(Date dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    @Override
    public String toString() {
        return "Oggetto Prime⭐️ :" + "\n" + "codiceBarre: " + codiceBarre + '\n' +
                "prezzo: " + prezzo + "€" + "\n" +
                "descrizione: " + descrizione + '\n'
                + "dataScadenza: " + dataScadenza + '\n';
    }
    
    @Override
    public void aggiungiLista() throws Exception {

        try {
            writer = new BufferedWriter(new java.io.FileWriter("/Users/baldi/Desktop/Verifica/es1/src/lista.txt", true));
            writer.write(" Prodotto Prime ⭐️ " + codiceBarre + " " + prezzo + " " + descrizione + " " + dataScadenza);
            writer.newLine();
            writer.close();
        } catch (Exception e) {
            System.out.println("Errore nella scrittura del file");
        }
        
    }


    public void ScontoPrime(double prezzo) {
        double sconto = 0;
        // if the difference in days is less than 7 days

        if (dataScadenza.getTime() - new Date().getTime() <= 7 * 24 * 60 * 60 * 1000) {
            // 20%
            sconto = prezzo * 0.20;

            System.out.println("Sconto Prime del 20%");

            this.prezzo = prezzo - sconto;

        }

    }





    
}
