package com.ivliev.weather.repositories;

import com.ivliev.weather.bi.HibernateUtil;
import com.ivliev.weather.dao.WeatherEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WeatherRepo {



    public void add(WeatherEntity weatherEntity){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(weatherEntity);
        session.getTransaction().commit();

    }
}
