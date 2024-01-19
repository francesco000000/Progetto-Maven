package ProgettoSettimanale2;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainProgetto {
   public static void main(String[] args) throws IOException {
      Rivista r = new Rivista("u", LocalDate.now(),12,Periodicita.MENSILE,"012");

      Libro l = new Libro("ciao","fant","t",LocalDate.of(2021, Month.FEBRUARY, 15),12,"013");



      Archivio a = new Archivio();
      a.aggiungiElemento(l);
      a.aggiungiElemento(r);
      System.out.println(a.rimuoviElemento("012"));
      System.out.println(a.cercaElemento("012"));
      System.out.println(a.cercaPerData(LocalDate.of(2021, Month.FEBRUARY, 15)));
      System.out.println(a.cercaPerAutore("ciao"));




   }


}
