package programa;

import dao.DisciplinaDAO;
import entidade.Disciplina;

public class DisciplinaPersistenceTest {

	
	
	public static void main(String[] args) {
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		Disciplina disciplina = new Disciplina("calculo 1", "A01");
		disciplinaDAO.salva(disciplina);
	}
}
