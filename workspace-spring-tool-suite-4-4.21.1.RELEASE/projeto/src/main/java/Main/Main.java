package Main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import aulapw.Produtos;

public class Main {
	public static void main(String[]args) {
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("");
		EntityManager em  = emf.createEntityManager();
		Produtos p1 = new Produtos("1231234567345", "biscoito de chocolate", "trakinas", "4", "09/03/2024");
		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();
		
	}
}
