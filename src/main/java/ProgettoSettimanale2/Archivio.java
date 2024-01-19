package ProgettoSettimanale2;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Archivio {
    private List<ElementoEditoriale> catalogo = new ArrayList<>();

    public List<ElementoEditoriale> getcatalogo() {
        return catalogo;
    }
    public void aggiungiElemento( ElementoEditoriale e){
        catalogo.add(e);
    }

    public List<ElementoEditoriale> rimuoviElemento(String isbn){
        return catalogo.stream()
                .filter(elemento -> elemento.getISBN() !=isbn).collect(Collectors.toList());

    }
    public List<ElementoEditoriale> cercaElemento(String isbn){
        return catalogo.stream()
                .filter(elemento -> elemento.getISBN() ==isbn).collect(Collectors.toList());

    }
    public List<ElementoEditoriale> cercaPerData(LocalDate data){
        return catalogo.stream()
                .filter(elemento ->elemento.getAnnoPublicazione().equals(data) ).collect(Collectors.toList());

    }

        public List<ElementoEditoriale> cercaPerAutore(String autore) {
            return catalogo.stream()
                    .filter(elemento -> elemento instanceof Libro && ((Libro) elemento).getAutore().equals(autore))
                    .collect(Collectors.toList());

    }
    public  void salvaElementoSuDisco() throws  IOException {
        File file = new File("dirElemento/elemento.txt");

        String stringaProdotti = catalogo.stream().map(e->e.getTitolo()+"@"+e.getAnnoPublicazione()+"@"+e.getNumeroPagine()).collect(Collectors.joining("#"));

        FileUtils.writeStringToFile(file, stringaProdotti, Charset.defaultCharset(), true);

    }
    public  String leggiElementiDaDisco() throws IOException {
        File file = new File("dirProdotti/prodotti.txt");

        String elementi =  FileUtils.readFileToString(file, Charset.defaultCharset());
        return elementi;
    }



    @Override
    public String toString() {
        return "Archivio{" +
                "catalogo=" + catalogo +
                '}';
    }
}
