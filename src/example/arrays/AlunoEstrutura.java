package example.arrays;

public class AlunoEstrutura {

	// Declarando e Inicializando um array de Aluno com capacidade 100.
	private Aluno[] alunos = new Aluno[40];
	private int totalAlunos=0;
	
	public void adiciona(Aluno aluno) {
		alunos[totalAlunos] = aluno;
		totalAlunos++;
//		for(int i=0; i<alunos.length; i++) {
//			if(alunos[i] == null) {
//				alunos[i] = aluno;
//				break;
//			}
//		}
	}
	
	public void adiciona(Aluno aluno, int posicao) {
		posicao = posicaoHaAdicionar(posicao);
		
		if(alunos[posicao]==null) {
			alunos[posicao] = aluno;
		}
		else {
			for(int i=totalAlunos; i>posicao; i--) {
				alunos[i] = alunos[i-1];
			}
			alunos[posicao] = aluno;
		}
		
		totalAlunos++;
	}
	
	private int posicaoHaAdicionar(int posicao) {
		if(posicao > totalAlunos) {
			posicao = totalAlunos;
		}
		
		return posicao;
	}
	
	public Aluno pega(int posicao) {
		if(ehUmaPosicaoValida(posicao)) {
			return null;
		}
		
		return alunos[posicao];
	}
	
	public void remove(int posicao) {
		if(ehUmaPosicaoValida(posicao)) {
			for(int i = posicao; i < totalAlunos; i++) {
				alunos[i] = alunos[i+1];
			}
			
			totalAlunos--;
		}
	}
	
	private boolean ehUmaPosicaoValida(int posicao) {
		if(posicao >=totalAlunos || posicao < 0) {
			return false;
		}
		return true;
	}
	
	public boolean contem(Aluno aluno) {
		if(aluno==null) {
			return false;
		}
		
		for(int i=0; i<totalAlunos; i++) {
			if(alunos[i].getId()==aluno.getId()) {
				return true;
			}
		}
		
		return false;
	}
	
	public int tamanho() {
		return totalAlunos;
	}
	
	public String toString() {
		String retorno = "";
		
		for(int i=0; i<alunos.length; i++) {
			if(alunos[i] != null) {
				retorno = retorno + alunos[i]+"\n";
			}
			else {
				break;
			}
		}
		
		return retorno;
	}
}