package utils;

import lombok.Getter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Getter
public class SessionFactoryImpl {
    private SessionFactory sessionFactoryUtil;
    private Session session;

    public SessionFactoryImpl() {
        sessionFactoryUtil = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        session = sessionFactoryUtil.getCurrentSession();
    }
}