import java.util.Date;

public class CarrelloMain  {
    public static void main(String[] args) throws Exception  {



        Prodotti p1 = new Prodotti("123456789", 10, "Prodotto generico");   

        Prime p2 = new Prime("123456789", 100, "oggetto bellissimo Prime",
                new Date(new Date().getTime() + 9 * 24 * 60 * 60 * 1000));

        Normali p3 = new Normali("123456789", 100, "oggetto bellissimo Normale", false);

        // p1.aggiungiLista();
        p2.aggiungiLista();
        // p3.aggiungiLista();

        // p2.AmazonDiscount(p2.getPrezzo());
        // p3.AmazonDiscount(p3.getPrezzo());

        // p2.ScontoPrime(p2.getPrezzo());
        // p3.AmazonDiscount(p3.getPrezzo());


    }
}

