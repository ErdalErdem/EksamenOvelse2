import java.time.LocalDate;
import java.util.Locale;

public class Film {
    private String filmTitel;
    private int udgivelsesår;
    private Producer producer;

    public Film(String filmTitel, int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
        this.filmTitel = filmTitel;

    }

    public Film(String filmTitel) {
        this.filmTitel = filmTitel;
        udgivelsesår = LocalDate.now().getYear();

    }

    public Film(String filmTitel, Producer producer) {
        this.filmTitel = filmTitel;
        udgivelsesår = LocalDate.now().getYear();
        this.producer = producer;
    }

    public String toString() {
        return "Film titel\n" + filmTitel + "\n Udgivelsesår\n" + udgivelsesår + "Producer" + producer;
    }
}
