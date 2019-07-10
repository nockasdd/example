package online.hayho.core.daoimpl;

import org.hibernate.HibernateException;
import online.hayho.core.common.utils.HibernateUtil;
import online.hayho.core.dao.UserDao;
import online.hayho.core.data.daoimpl.AbstractDao;
import online.hayho.core.persistence.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class UserDaoImpl extends AbstractDao<Integer, UserEntity> implements UserDao {
     public UserEntity isUserExitst(String name, String password)   {
         UserEntity entity = new UserEntity();
         Session session = HibernateUtil.getSessionFactory().openSession();
         Transaction transaction = session.beginTransaction();
         try{
             StringBuilder sql = new StringBuilder("FROM UserEntity WHERE name= :name AND password= :password");
             Query query = session.createQuery(sql.toString());
             query.setParameter("name", name);
             query.setParameter("password", password);
             entity = (UserEntity) query.uniqueResult();
             transaction.commit();
         }catch (HibernateException e){
             transaction.rollback();
             throw e;
         }finally {
             session.close();
         }
         return entity;
    }

    public UserEntity findRoleByUser(String name, String password) {
        UserEntity entity = new UserEntity();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try{
            StringBuilder sql = new StringBuilder("FROM UserEntity WHERE name= :name AND password= :password");
            Query query = session.createQuery(sql.toString());
            query.setParameter("name", name);
            query.setParameter("password", password);
            entity = (UserEntity) query.uniqueResult();
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
            throw e;
        }finally {
            session.close();
        }
        return entity;
    }
}
