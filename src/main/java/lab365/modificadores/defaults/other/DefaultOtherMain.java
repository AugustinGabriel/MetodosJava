package lab365.modificadores.defaults.other;

import lab365.modificadores.defaults.DefaultPessoa;

public class DefaultOtherMain {

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

			/** 
			 * Descomente o metodo abaixo.
			 * Com isso verá que o método não está visível.
			 * 
			 * O motivo é o modificador "default" que 
			 * impede que qualquer outra classes de outros 
			 * pacotes o acesse.
			 */
			// pessoa.fazAniversario();
			atingiuMaioridade = pessoa.verificaMaioridade();
		}

		return pessoa;
	}

}
