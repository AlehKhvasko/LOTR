package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryImpl {
    private SessionFactory sessionFactoryUtil;

    public Session SessionFactoryImpl(){
        sessionFactoryUtil = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        return sessionFactoryUtil.getCurrentSession();
    }
}