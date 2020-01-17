package one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class OnetoOneApp {
public static void main(String[] args) {
	AnnotationConfiguration config=new AnnotationConfiguration();
	config.configure("Hibernate.cfg.xml");
	SessionFactory sessionFactory=config.buildSessionFactory();
	Session session=sessionFactory.openSession();
	Transaction tx=session.beginTransaction();
	
	Student std=new Student();
	std.setRno(127);
	std.setName("deloitte");
	
	Address addr=new Address();
	addr.setAddressid(12);
	addr.setCity("hyd");
	addr.setStudent(std);
session.save(addr);
tx.commit();
session.close();


}
}
