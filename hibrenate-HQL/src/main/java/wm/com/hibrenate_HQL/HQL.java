package wm.com.hibrenate_HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQL {
	public static void main(String[]args) {
		try {
		       Configuration cfg = new Configuration();
		              cfg.configure();
		              SessionFactory sess=cfg.buildSessionFactory();
		              Session s= sess.openSession();
		              Transaction txn=s.beginTransaction();
		              Query q = s.createQuery("select sname,sid from Student where cgpa>7");
		              List<Object[]> sdsob = (List<Object[]>) q.list();
		              for(Object[] s1 : sdsob) {
		              System.out.println(s1[0] + ":" + s1[1]);
		              }
		               
		       txn.commit();
		}catch(Exception e) {
		              e.printStackTrace();
		       }
	}
}
//1.HQL query to  display all students  Records
/*Query q = s.createQuery("from Student"); //here Student persistence class name not table name
List<Student> list =  q.list();
System.out.println(list);
for(Student s1 : list) {
  System.out.println(s1);
 }

//2.//HQL query to display all student records with specific columns.
// Query q = s.createQuery("select sid,sname from Student where cgpa >7");
//List<Object[]> sdsob = (List<Object[]>) q.list();
//for(Object[] s1 : sdsob) {
//System.out.println(s1[0]+ ":" + s1[1]);
//}
txn.commit();


//3.HQL query to display only names of all students whose CGPA is greater than 7. 

/*  Query q = s.createQuery("select sname,sid from Student where cgpa>7");
    List<Object[]> sdsob = (List<Object[]>) q.list();
    
    for(Object[] s1 : sdsob) {
    System.out.println(s1[0] + ":" + s1[1]);
    }*/

//4.HQL query to delete a Student whose Student ID is 30101 using input parameter (?) as well as named parameter (:)
          
/*  Query q=s.createQuery("delete from Student where sid=:tempid");  
  q.setParameter("tempid",5);        
  int status=q.executeUpdate();  
  System.out.println(status); */

// 5. HQL query to update few details of a student whose Student ID is 30102 using input parameter (?) as well as named parameter (:)  

   /* Query q=s.createQuery("update Student set sname=:n where sid=:i");  
    q.setParameter("n","Tulasi Sajja");  
    q.setParameter("i",5);  
      
    int status=q.executeUpdate();  
    System.out.println(status);*/


//6.//HQL query to perform aggregate functions like count (*), sum(), avg(), min(), max() functions on CGPA column.

/*  Query q = s.createQuery("select max(cgpa) from Student");
    List<Integer> list=q.list();  
System.out.println(list.get(0));  */