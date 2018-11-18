package br.com.DAO;

import br.com.ClassesUsuarios.Aluno;


public class AlunoDAO {
	
	public Aluno buscaAlunoPorNome(String nomeA) {
		int cont;
		String nomeB;
		Aluno alunoC = null;
		
		for(cont=0; cont<alunos.size(); cont++) {
			nomeB = alunos.get(cont).getNome();
			if(nomeB.equals(nomeA)){
				alunoC = alunos.get(cont);
				break;
			}
		}
		return alunoC;
	}
	
	
	public void adicionaAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	
	int cont;
	String nome;
	public void listarAluno() {
		for(cont=0; cont<=alunos.size(); cont++) {  
			nome = alunos.get(cont).getNome();
			System.out.println(nome);
		}										
	}
}
