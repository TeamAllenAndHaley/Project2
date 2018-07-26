package com.allenhaley.maintest;

import com.allenhaley.config.HibernateConfigUtil;
import com.allenhaley.dao.LocationDao;
import com.allenhaley.dao.LocationDaoImpl;
import com.allenhaley.model.Announcement;
import com.allenhaley.model.Location;
import org.hibernate.Session;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    private static LocationDao ld = new LocationDaoImpl();
    public static void main(String[] args) throws ParseException {

        Session session = HibernateConfigUtil.getSessionFactory().openSession();
        session.beginTransaction();

//        Location l = new Location();
//        l.setLocation("Tampa, FL");
//        l.setClassLoc("MUMA 1102");
//        l.setLocId(3);

        Location l = ld.find(1L);

        System.out.println("Location: " + l.getLocation());
        System.out.println("Classroom: " + l.getClassLoc());

//        session.save(l);
        

        session.getTransaction().commit();
        session.close();
        HibernateConfigUtil.shutdown();

    }

}
