package online.hayho.core.common.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory buildSessionFactory() {
        try{
            //create sessionfactory form hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();
        }catch (Throwable e){
            System.out.println("Initial session factory fail" + e);
            throw new ExceptionInInitializerError(e);
        }


    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
