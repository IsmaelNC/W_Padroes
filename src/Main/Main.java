package Main;

import java.util.Scanner;

import br.com.ClassesUsuarios.Aluno;
import br.com.ClassesUsuarios.Monitor;
import br.com.ClassesUsuarios.Professor;
import br.com.ClassesUsuarios.Coordenador;
import br.com.ClassesEmpregadas.Contato;
import br.com.Banco.Banco;


public class Main {

	public static void main(String[] args) {
		
	//	Banco bancoUnico = new Banco();
		Scanner sc = new Scanner(System.in);
		int cont;
		String opcaoStr;
		int opcaoInt;
		
		for (cont = 0; cont < 2; cont++) {

			System.out.println("");
			System.out.println("*** SISTEMA DE ...");
			System.out.println("");
			System.out.println("Insira a opção de navegação: ");
			System.out.println("Aluno - Professor - Monitor - Coordenador");
			opcaoStr = sc.next();
			
			switch(opcaoStr) {
			case "Aluno":
				System.out.println("Entrou na navegação de Aluno");
				System.out.println("");
				System.out.println("Insira sua opcao de navegação: 1 Cadastrar - 2 Listar - 3 Remover");
				opcaoInt = sc.nextInt();
				
				switch(opcaoInt) {
				case 1:
					System.out.println("Entrou Cadastramento de Aluno - Insira os dados do Aluno: ");
					System.out.println("Id: ");
					String id = sc.next();
					System.out.println("Nome:");
					String nome = sc.next();
					System.out.println("Endereço:");
					String endereco = sc.next();
					System.out.println("Telefone: ");
					String telefone = sc.next();
					System.out.println("Email: ");
					String email = sc.next();
					Contato contato = new Contato(telefone, email);
					System.out.println("Insira o Curso: ");
					String curso = sc.next();
					Aluno aluno = new Aluno();
					aluno.setId(id);
					aluno.setNome(nome);
					aluno.setEndereço(endereco);
					aluno.setContato(contato);
					aluno.setCurso(curso);
					
					
					break;
					
				case 2:
					//entrou aqui
					break;
				}
			break;
			
			case "Professor":
				System.out.println("Entrou na navegação de Professor");
				System.out.println("");
				System.out.println("Insira sua opcao de navegação: 1 Cadastrar - 2 Listar - 3 Remover");
				opcaoInt = sc.nextInt();
				
				switch(opcaoInt) {
				case 1:
					System.out.println("Entrou Cadastramento de Professor - Insira os dados do Professor: ");
					System.out.println("Id: ");
					String id = sc.next();
					System.out.println("Nome:");
					String nome = sc.next();
					System.out.println("Endereço:");
					String endereco = sc.next();
					System.out.println("Telefone: ");
					String telefone = sc.next();
					System.out.println("Email: ");
					String email = sc.next();
					Contato contato = new Contato(telefone, email);
					System.out.println("Insira o Curso: ");
					String disciplina = sc.next();
					Professor professor = new Professor();
					professor.setId(id);
					professor.setNome(nome);
					professor.setEndereço(endereco);
					professor.setContato(contato);
					professor.setDisciplina(disciplina);
					
					
					
					break;
					
				case 2:
					//entrou aqui
					break;
				}
			break;
			
			case "Monitor":
				System.out.println("Entrou na navegação de Professor");
				System.out.println("");
				System.out.println("Insira sua opcao de navegação: 1 Cadastrar - 2 Listar - 3 Remover");
				opcaoInt = sc.nextInt();
				
				switch(opcaoInt) {
				case 1:
					
					System.out.println("Entrou Cadastramento de Monitor - Insira os dados do Monitor: ");
					System.out.println("Id: ");
					String id = sc.next();
					System.out.println("Nome:");
					String nome = sc.next();
					System.out.println("Endereço:");
					String endereco = sc.next();
					System.out.println("Telefone: ");
					String telefone = sc.next();
					System.out.println("Email: ");
					String email = sc.next();
					Contato contato = new Contato(telefone, email);
					System.out.println("Insira o Curso: ");
					String disciplina = sc.next();
					Monitor monitor = new Monitor();
					monitor.setId(id);
					monitor.setNome(nome);
					monitor.setEndereço(endereco);
					monitor.setContato(contato);
					monitor.setDisciplina(disciplina);
					
					
					
					break;
				
				case 2:
					//entrou aqui
					break;
				}
			break;
				
			case "Coordenador":
				System.out.println("Entrou na navegação de Professor");
				System.out.println("");
				System.out.println("Insira sua opcao de navegação: 1 Cadastrar - 2 Listar - 3 Remover");
				opcaoInt = sc.nextInt();
				
				switch(opcaoInt) {
				case 1:
					
					
					System.out.println("Entrou Cadastramento de Coordenador - Insira os dados do Coordenador: ");
					System.out.println("Id: ");
					String id = sc.next();
					System.out.println("Nome:");
					String nome = sc.next();
					System.out.println("Endereço:");
					String endereco = sc.next();
					System.out.println("Telefone: ");
					String telefone = sc.next();
					System.out.println("Email: ");
					String email = sc.next();
					Contato contato = new Contato(telefone, email);
					System.out.println("Insira o Curso: ");
					String curso = sc.next();
					Coordenador coordenador = new Coordenador();
					coordenador.setId(id);
					coordenador.setNome(nome);
					coordenador.setEndereço(endereco);
					coordenador.setContato(contato);
					coordenador.setDisciplina(curso);
					
					
					
					break;
					
				case 2:
					//entrou aqui
					break;
				}
			break;
			}
	}
}
}











