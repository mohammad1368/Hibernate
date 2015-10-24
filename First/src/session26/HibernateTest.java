package session26;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
	
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure("session26/hibernate.cfg.xml");
		cfg.addAnnotatedClass(StudentEntity.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		StudentEntity entity=new StudentEntity();
		entity.setName("hoseein");
		entity.setCode("02");
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}

}
