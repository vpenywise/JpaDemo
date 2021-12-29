package com.vlado.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args ) {
    	
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");
    	EntityManager entityManager = entityManagerFactory.createEntityManager();
        
    	Employee employee = entityManager.find(Employee.class, 100);
    	
    	System.out.println(employee);
    	
    }
}
