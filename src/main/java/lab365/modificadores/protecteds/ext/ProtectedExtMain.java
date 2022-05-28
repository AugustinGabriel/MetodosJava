package lab365.modificadores.protecteds.ext;

public class ProtectedExtMain {

	public static void main(String[] args) {
		utilizandoMetodosProtected();
	}

	public static void utilizandoMetodosProtected() {
		System.out.println("\n"); // Quebra de linha
		System.out.println("############################");
		System.out.println("# Métodos protegidos (ext) #");
		System.out.println("############################");
		System.out.println("\n"); // Quebra de linha

		ProtectedPessoaExt claudio = criandoAteMaioridade("Claudio", 15);

		System.out.println("Agora " + claudio.getNome() + " tem " + claudio.getIdade() + " anos de idade!");
	}

	public static ProtectedPessoaExt criandoAteMaioridade(String nome, Integer idade) {

		ProtectedPessoaExt pessoa = new ProtectedPessoaExt(nome, idade); // Instanciando uma pessoa (dados públicos)

		// Armazenando retorno do método em uma variável local
		boolean atingiuMaioridade = pessoa.verificaMaioridade();

		while (!atingiuMaioridade) {
			pessoa.fazAniversario();
			atingiuMaioridade = pessoa.verificaMaioridade();
		}

		return pessoa;
	}

}
