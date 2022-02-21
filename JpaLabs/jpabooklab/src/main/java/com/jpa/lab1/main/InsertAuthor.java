package com.jpa.lab1.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jpa.lab1.entity.Author;

public class InsertAuthor 
{
	public static void main(String[] args) 
	{
		Author author = new Author();
		
		//author.setAuthorId(1);
		author.setFirstName("sandeep");
		author.setMiddleName("kumar");
		author.setLastName("narsepalle");
		author.setPhoneNo("123456789");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		em.persist(author);
		txn.commit();
		System.out.println("Author saved");
		
		em.clear();
		emf.close();
	}
}
