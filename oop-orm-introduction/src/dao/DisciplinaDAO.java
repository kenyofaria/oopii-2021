package dao;

import javax.persistence.EntityManager;

import entidade.Disciplina;

public class DisciplinaDAO {

	private EntityManager em = new JPAUtil().getEntityManager();
	
	public void salva(Disciplina disciplina) {
		em.getTransaction().begin();
		em.persist(disciplina);
		em.getTransaction().commit();
	}
}
