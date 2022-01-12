package programa;

import java.time.LocalDate;

import dao.AlunoDAO;
import entidade.Aluno;

public class TestePersistenciaAluno {

	
	
	public static void main(String[] args) {
		
		
		insereAluno();
		
		
//		AlunoDAO alunoDAO = new AlunoDAO();
		//List<Aluno> mulheres = alunoDAO.getMulheres();
//		for (Aluno aluno : mulheres) {
//			System.out.println(aluno.getNome());
//		}
		
		
//		System.out.println("\n\n estado 1");
//		Aluno alunoExistente = alunoDAO.get(1L);
//		System.out.println(alunoExistente.getNome() + " --  " + alunoExistente.getDataNascimento());
		
		
//		System.out.println("\n\n estado 2");
//		alunoExistente.setSexo("M");
//		alunoDAO.salva(alunoExistente);
//		alunoExistente = alunoDAO.get(1L);
//		System.out.println(alunoExistente.getNome() + " --  " + alunoExistente.getDataNascimento());
		
		
	}

	private static void insereAluno() {
		Aluno aluno = new Aluno("jean", LocalDate.now(), "m");
		AlunoDAO dao = new AlunoDAO();
		dao.salva(aluno);
	}
}
