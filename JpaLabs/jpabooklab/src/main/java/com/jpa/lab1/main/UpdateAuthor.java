package com.jpa.lab1.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jpa.lab1.entity.Author;

public class UpdateAuthor 
{
	public static void main(String[] args) 
	{
		Author author = new Author();
		
		author.setAuthorId(3);
		author.setFirstName("ram");
		author.setMiddleName("sai");
		author.setLastName("krishna");
		author.setPhoneNo("9885898858");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		em.merge(author);
		txn.commit();
		System.out.println("Author updated");
		
		em.clear();
		emf.close();
	}
}
