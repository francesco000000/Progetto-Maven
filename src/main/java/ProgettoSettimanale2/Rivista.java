package ProgettoSettimanale2;

import java.time.LocalDate;

public class Rivista extends ElementoEditoriale{
private Periodicita periodicita;

    public Rivista(String titolo, LocalDate annoPublicazione, int numeroPagine,  Periodicita periodicita,String ISBN) {
        super(titolo, annoPublicazione, numeroPagine,ISBN);

        this.periodicita = periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "periodicita=" + periodicita +
                "} " + super.toString();
    }
}
