package ProgettoSettimanale2;

import java.time.LocalDate;

public class Libro extends ElementoEditoriale{
  private String autore;
  private String genere;

    public Libro(String autore, String genere, String titolo, LocalDate annoPublicazione,int numeroPagine,String ISBN) {
        super(titolo, annoPublicazione, numeroPagine,ISBN);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                "} " + super.toString();
    }
}

