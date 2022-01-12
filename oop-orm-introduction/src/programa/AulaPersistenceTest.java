package programa;

import java.time.LocalDate;

import dao.AulaDAO;
import entidade.Aula;
import entidade.Disciplina;

public class AulaPersistenceTest {

	
	public static void main(String[] args) {
		
		Aula aula = new Aula();
		aula.setData(LocalDate.now());
		aula.setConteudo("aula sobre funções e limites");
		Disciplina disciplina = new Disciplina(1L);
			
		AulaDAO aulaDAO = new AulaDAO();
		aulaDAO.salva(aula, disciplina);
	}
}
