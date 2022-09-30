package example.arrays;

public class AlunoEstruturaTeste {

	public void testeAdicionarNoFim() {
		Aluno a1 = new Aluno(1, "Rafael");
		Aluno a2 = new Aluno(2, "Paulo");
		
		AlunoEstrutura lista = new AlunoEstrutura();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista.toString());
	}
	
	public void testeAdicionarPorPosicao() {
		Aluno a1 = new Aluno(1, "Rafael");
		Aluno a2 = new Aluno(2, "Paulo");
		Aluno a3 = new Aluno(3, "Ana");
		
		AlunoEstrutura lista = new AlunoEstrutura();
		
		lista.adiciona(a1);
		lista.adiciona(a2,0);
		lista.adiciona(a3,1);
		
		System.out.println(lista);
	}
	
	public void pegarAlunoPorPosicao() {
		Aluno a1 = new Aluno(1, "Rafael");
		Aluno a2 = new Aluno(2, "Paulo");
		
		AlunoEstrutura lista = new AlunoEstrutura();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		Aluno aluno1 = lista.pega(0);
		Aluno aluno2 = lista.pega(1);
		Aluno aluno3 = lista.pega(3);
		
		System.out.println(aluno1);
		System.out.println(aluno2);
		System.out.println(aluno3);
	}
	
	public void removerAlunoPorPosicao() {
		Aluno a1 = new Aluno(1, "Rafael");
		Aluno a2 = new Aluno(2, "Paulo");
		Aluno a3 = new Aluno(3, "Thiago");

		AlunoEstrutura lista = new AlunoEstrutura();
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		
		lista.remove(0);
		lista.remove(3);
		
		System.out.println(lista);
	}
	
	public void testarSeContemAluno() {
		Aluno a1 = new Aluno(1, "Rafael");
		Aluno a2 = new Aluno(2, "Paulo");

		AlunoEstrutura lista = new AlunoEstrutura();
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista.contem(a1));
		System.out.println(lista.contem(a2));
		
		Aluno aluno = new Aluno(3, "Ana");
		System.out.println(lista.contem(aluno));
	}
	
	public void testarTamanhoDaListaEmSequencia() {
		Aluno a1 = new Aluno(1, "Rafael");
		Aluno a2 = new Aluno(2, "Paulo");
		Aluno a3 = new Aluno(3, "Arnaldo");
		
		AlunoEstrutura lista = new AlunoEstrutura();
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista.tamanho());
		
		lista.adiciona(a3);
		
		System.out.println(lista.tamanho());
	}
	
	public void testarTamanhoDaListaAleatoria() {
		Aluno a1 = new Aluno(1, "Rafael");
		Aluno a2 = new Aluno(2, "Paulo");
		Aluno a3 = new Aluno(3, "Arnaldo");
		
		AlunoEstrutura lista = new AlunoEstrutura();
		lista.adiciona(a1);
		lista.adiciona(a2, 3);
		
		System.out.println(lista.tamanho());
		
		lista.adiciona(a3, 7);
		
		System.out.println(lista.tamanho());
	}
	
	public static void main(String args[]) {
		AlunoEstruturaTeste testes = new AlunoEstruturaTeste();
		
		testes.testeAdicionarNoFim();
		System.out.println("*****************************************");
		testes.testeAdicionarPorPosicao();
		System.out.println("*****************************************");
		testes.pegarAlunoPorPosicao();
		System.out.println("*****************************************");
		testes.removerAlunoPorPosicao();
		System.out.println("*****************************************");
		testes.testarSeContemAluno();
		System.out.println("*****************************************");
		testes.testarTamanhoDaListaEmSequencia();
		System.out.println("*****************************************");
		testes.testarTamanhoDaListaAleatoria();
	}
}