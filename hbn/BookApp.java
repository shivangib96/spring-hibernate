package hbn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class BookApp {

public static void main(String[] args) {
// TODO Auto-generated method stub
AnnotationConfiguration cfg=new AnnotationConfiguration();
cfg.configure();
SessionFactory factory=cfg.buildSessionFactory();
Session ssn=factory.openSession();
Transaction tx=ssn.beginTransaction();
Book book=new Book();
book.setBookid(1002);
book.setTitle("Oracle");
book.setAuthor("xyz");
book.setPrice(6000);


DotnetBook dotnet=new DotnetBook();
dotnet.setBookid(2003);
dotnet.setTitle("ASP.net");
dotnet.setAuthor("abcde");
dotnet.setPrice(800);
dotnet.setCd(3);

JavaBook java=new JavaBook();
java.setBookid(4008);
java.setTitle("Spring progr");
java.setAuthor("Rod johnson");
java.setPrice(900);
java.setDiscount(25);

ssn.save(book);
ssn.save(dotnet);
ssn.save(java);
tx.commit();
ssn.close();

}

}
