//package com.allenhaley.maintest;
//
//import com.allenhaley.dao.*;
//import com.allenhaley.model.Announcement;
//import com.allenhaley.model.Employee;
//import com.allenhaley.model.Housing;
//import com.allenhaley.model.Location;
//import org.hibernate.Session;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//public class Main {
//
//    private static LocationDao ld = new LocationDaoImpl();
//    private static EmployeeDao ed = new EmployeeDaoImpl();
//    private static HousingDao hd = new HousingDaoImpl();
//    public static void main(String[] args) throws ParseException {
//
//        Session session = HibernateConfigUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//
//        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
//        Date d = format.parse("07/14/1992");
//
////        Location l = new Location();
////        l.setLocation("Tampa, FL");
////        l.setClassLoc("MUMA 1102");
////        l.setLocId(3);
//
////        Location l = ld.find(3L);
//
////        System.out.println("Location: " + l.getLocation());
////        System.out.println("Classroom: " + l.getClassLoc());
//
////        session.save(l);
//
////        ld.delete(l);
//
////        Employee e = new Employee();
////        e.setfName("Test");
////        e.setlName("User");
////        e.setEmail("testuser@gmail.com");
////        e.setHasCar(true);
////        e.setEmailSubbed(false);
////        e.setdOfBirth(d);
////        e.setCanContact(true);
////        e.setDepartment("HR");
////
////        ed.add(e);
////        Employee e = ed.find(3L);
//
////        Location l = ld.find(1L);
////        Housing h = hd.find(1L);
////        System.out.println(l);
////        e.setLoc(l);
////        e.setH(h);
////
////        System.out.println(e.getLoc());
////        ed.update(e);
//
//        List<Employee> employees = (List<Employee>)ed.all();
//        for(Employee e : employees) {
//            System.out.println(e);
//        }
//
//        session.getTransaction().commit();
//        session.close();
//        HibernateConfigUtil.shutdown();
//
//    }
//
//}
