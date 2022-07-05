package repository;

import models.entity.ListOfBookEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.SessionFactoryImpl;

public class BookRepository {

    public ListOfBookEntity save(ListOfBookEntity listOfBookEntity) {
        Transaction transaction = null;

        try (Session session = new SessionFactoryImpl().getSession().getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.persist(listOfBookEntity);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw e;
        }
        return null;
    }
}
