package session26;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentHibernate {
	
	public static Session getSession() {
		Configuration cfg=new Configuration().configure("session26/hibernate.cfg.xml");
		cfg.addAnnotatedClass(StudentEntity.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}
	
	public static void delete(Integer id) {
		Session session=getSession();
		StudentEntity entity = session.load(StudentEntity.class, id);
		session.beginTransaction();
		session.delete(entity);
		session.getTransaction().commit();
	}

}
