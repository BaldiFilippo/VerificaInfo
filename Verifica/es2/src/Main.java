import java.io.FileReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {

        FileReader file = new FileReader("/Users/baldi/Desktop/Verifica/es2/src/FanDiHarryPotter.txt");
        BufferedReader buffer = new BufferedReader(file);

        String line;
        Libro Libri[] = new Libro[8];
        int i = 0;
        while ((line = buffer.readLine()) != null) {
            String[] libro = line.split(",");
            Libri[i] = new Libro(libro[0], Integer.parseInt(libro[1]));
            i++;
        }


        buffer.close();
        file.close();


        double prezzoStampa = 0;

        for (int j = 0; j < Libri.length; j++) {

            prezzoStampa += Libri[j].getPagine() * 0.17;
        }

        //approssimare a 2 cifre decimali
        prezzoStampa = Math.round(prezzoStampa * 100.0) / 100.0;
        System.out.println("Prezzo totale: " +  prezzoStampa + "€" + "\n");

        Libro max = Libri[0];

        for (int j = 0; j < Libri.length; j++) {

            if (Libri[j].getPagine() > max.getPagine()) {
                max = Libri[j];
            }
        }

        System.out.println("Libro più lungo: " + max.getTitolo() + "\n");

        System.out.println("Libri con più di 400 pagine: ");
        
        for (int j = 0; j < Libri.length; j++) {

            if (Libri[j].getPagine() > 400) {
                System.out.println(Libri[j].getTitolo() + " (" + Libri[j].getPagine() + " pagine)");
            }
        }

        System.out.println();

    }
}
