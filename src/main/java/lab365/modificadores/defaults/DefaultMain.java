package lab365.modificadores.defaults;

public class DefaultMain {

	public static void main(String[] args) {
		utilizandoMetodosDefault();
	}

	public static void utilizandoMetodosDefault() {
		System.out.println("\n"); // Quebra de linha
		System.out.println("###################");
		System.out.println("# Métodos padrões #");
		System.out.println("###################");
		System.out.println("\n"); // Quebra de linha

		DefaultPessoa dafine = criandoAteMaioridade("Dafine", 15);

		System.out.println("Agora " + dafine.getNome() + " tem " + dafine.getIdade() + " anos de idade!");
	}

	public static DefaultPessoa criandoAteMaioridade(String nome, Integer idade) {

		DefaultPessoa pessoa = new DefaultPessoa(nome, idade); // Instanciando uma pessoa (dados públicos)

		// Armazenando retorno do método em uma variável local
		boolean atingiuMaioridade = pessoa.verificaMaioridade();

		while (!atingiuMaioridade) {
			pessoa.fazAniversario();
			atingiuMaioridade = pessoa.verificaMaioridade();
		}

		return pessoa;
	}

}
