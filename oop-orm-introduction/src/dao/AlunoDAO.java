package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entidade.Aluno;

public class AlunoDAO {

	private EntityManager em = new JPAUtil().getEntityManager();
	
	public void salva(Aluno aluno) {
		try {
			em.getTransaction().begin();
			em.persist(aluno);
			em.getTransaction().commit();		
		}catch(Exception e) {
			em.getTransaction().rollback();
		}
	}
	

	public List<Aluno> getMulheres(){
		TypedQuery<Aluno> query = em.createQuery("from Aluno where sexo = :pSexo", Aluno.class);
		query.setParameter("pSexo", "F");
		return query.getResultList();
	}
	
	public Aluno get(Long id) {
		return em.find(Aluno.class, id);
	}
}
