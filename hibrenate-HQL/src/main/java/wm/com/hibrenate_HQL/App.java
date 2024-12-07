package wm.com.hibrenate_HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import wm.com.hibrenate_HQL.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      try {
          Configuration cfg=new Configuration();
          cfg.configure();
          SessionFactory sess=cfg.buildSessionFactory();
          Session s=sess.openSession();
          
          Transaction txn=s.beginTransaction();
          
          Student sd=new Student();
          sd.setSid(32200);
          sd.setSname("Mohith");
          sd.setGender("M");
          sd.setDept("Bio");
          sd.setPgm("B.Tech");
          sd.setDob("28/4/2004");
          sd.setPhno(455575445);
          sd.setGs("yes");
          sd.setCgpa(6);
          sd.setNblogs(0);
          
           s.save(sd);
             
             txn.commit();
      }catch(Exception e) {
            e.printStackTrace();
          }
    }
}