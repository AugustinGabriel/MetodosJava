package lab365.modificadores.publics;

public class PublicMain {

	public static void main(String[] args) {
		utilizandoMetodosPublic();
	}

	public static void utilizandoMetodosPublic() {

		System.out.println("\n"); // Quebra de linha
		System.out.println("####################");
		System.out.println("# Métodos públicos #");
		System.out.println("####################");
		System.out.println("\n"); // Quebra de linha

		PublicPessoa ana = criandoAteMaioridade("Ana", 15);

		System.out.println("Agora " + ana.getNome() + " tem " + ana.getIdade() + " anos de idade!");

	}

	public static PublicPessoa criandoAteMaioridade(String nome, Integer idade) {

		PublicPessoa pessoa = new PublicPessoa(nome, idade); // Instanciando uma pessoa (dados públicos)

		// Armazenando retorno do método em uma variável local
		boolean atingiuMaioridade = pessoa.verificaMaioridade();

		while (!atingiuMaioridade) {
			pessoa.fazAniversario();
			atingiuMaioridade = pessoa.verificaMaioridade();
		}

		return pessoa;
	}

}
