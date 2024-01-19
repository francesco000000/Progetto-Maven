package ProgettoSettimanale2;

import java.time.LocalDate;

public abstract class  ElementoEditoriale {
private String titolo;
private LocalDate annoPublicazione;
private  int numeroPagine;
private String ISBN;


    public ElementoEditoriale(String titolo, LocalDate annoPublicazione, int numeroPagine,String ISBN) {
        this.titolo = titolo;
        this.annoPublicazione = annoPublicazione;
        this.numeroPagine = numeroPagine;
        this.ISBN = ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getAnnoPublicazione() {
        return annoPublicazione;
    }

    public void setAnnoPublicazione(LocalDate annoPublicazione) {
        this.annoPublicazione = annoPublicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }



    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public Object getISBN() {

        return ISBN;
    }


    @Override
    public String toString() {
        return "ElementoEditoriale{" +
                "titolo='" + titolo + '\'' +
                ", annoPublicazione=" + annoPublicazione +
                ", numeroPagine=" + numeroPagine +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}

