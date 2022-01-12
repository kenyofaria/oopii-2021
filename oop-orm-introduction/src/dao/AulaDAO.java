package dao;

import javax.persistence.EntityManager;

import entidade.Aula;
import entidade.Disciplina;

public class AulaDAO {

	private EntityManager em = new JPAUtil().getEntityManager();
	
	public void salva(Aula aula, Disciplina disciplina) {
		em.getTransaction().begin();
		Disciplina disciplinaCarregadaNoEntityManager = em.find(Disciplina.class, disciplina.getId());
		aula.setDisciplina(disciplinaCarregadaNoEntityManager);
		em.persist(aula);
		em.getTransaction().commit();
	}
}
