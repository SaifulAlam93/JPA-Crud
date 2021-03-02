package com.maven.jpa.JpaCrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.maven.jpa.JpaCrud.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Employee empl=new Employee();
    	empl.setId(7);
    	empl.setName("Kanon2");
    	empl.setAge(35);
    	empl.setEdu("Angular");
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
    	
    	
    	em.getTransaction().begin();
    	em.persist(empl);
    	em.getTransaction().commit();
    	
    	
    	
    	Employee emp= em.find(Employee.class, 3);
    	System.out.println(emp);
    	
    	Employee empl2=em.find(Employee.class, 6);
    	System.out.println(empl2);
    	
    }
}
