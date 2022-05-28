package lab365.modificadores.protecteds;

public class ProtectedMain {

	public static void main(String[] args) {
		utilizandoMetodosProtected();
	}

	public static void utilizandoMetodosProtected() {
		System.out.println("\n"); // Quebra de linha
		System.out.println("######################");
		System.out.println("# Métodos protegidos #");
		System.out.println("######################");
		System.out.println("\n"); // Quebra de linha

		ProtectedPessoa bento = criandoAteMaioridade("Bento", 15);

		System.out.println("Agora " + bento.getNome() + " tem " + bento.getIdade() + " anos de idade!");
	}

	public static ProtectedPessoa criandoAteMaioridade(String nome, Integer idade) {

		ProtectedPessoa pessoa = new ProtectedPessoa(nome, idade); // Instanciando uma pessoa (dados públicos)

		// Armazenando retorno do método em uma variável local
		boolean atingiuMaioridade = pessoa.verificaMaioridade();

		while (!atingiuMaioridade) {
			pessoa.fazAniversario();
			atingiuMaioridade = pessoa.verificaMaioridade();
		}

		return pessoa;
	}

}
