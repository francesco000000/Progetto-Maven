import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

public class Prova {
    public static void main(String[] args) throws IOException {
        Product p1 = new Product(01,"maglia","boy",107.5);
        Product p2 = new Product(02,"scarpe","boy",10.0);
        Product p3 = new Product(03,"biberon","baby",2.5);
        Product p4 = new Product(04,"bavaglino","baby",1.5);
        Product p5 = new Product(05,"cintura","boy",5.5);
        Product p6 = new Product(06,"libro1","books",102.5);
        Product p7 = new Product(07,"libro2","books",8.5);

        Customer c1 = new Customer(01,"c1",1);
        Customer c2 = new Customer(02,"c2",2);
        Customer c3 = new Customer(03,"c3",2);
        Customer c4 = new Customer(04,"c4",2);
        Customer c5 = new Customer(05,"c5",1);


        Order o1 = new Order(01,"ok", LocalDate.of(2021, Month.FEBRUARY, 15),LocalDate.of(2021, Month.FEBRUARY, 22),c1, List.of(p1,p4));
        Order o2 = new Order(02,"ok",LocalDate.of(2021, Month.FEBRUARY, 20),LocalDate.of(2021, Month.FEBRUARY, 28),c2,List.of(p2,p5));
        Order o3 = new Order(03,"ok",LocalDate.of(2021, Month.MARCH, 15),LocalDate.of(2021, Month.MARCH, 22),c3,List.of(p4,p7));
        Order o4 = new Order(04,"ok",LocalDate.of(2021, Month.APRIL, 15),LocalDate.of(2021, Month.APRIL, 22),c4,List.of(p3,p2));
        Order o5 = new Order(05,"ok",LocalDate.of(2021, Month.FEBRUARY, 16),LocalDate.of(2021, Month.FEBRUARY, 23),c5,List.of(p6,p5));

        List<Product> listaProdotti = List.of(p1,p2,p3,p4,p5,p6,p7);
        List<Order> listaOrdini = List.of(o1,o2,o3,o4,o5);
        System.out.println(listaOrdini.stream().collect(Collectors.groupingBy(Order::getCustomer)));
        System.out.println(listaProdotti.stream().mapToDouble(Product::getPrice).max().getAsDouble());
        System.out.println(listaProdotti.stream().map(Product::getCategory));


            File file = new File("dirProdotti/prodotti.txt");
            String stringaProdotti = "ciao";
        FileUtils.writeStringToFile(file, stringaProdotti, Charset.defaultCharset(), true);


    }
}
