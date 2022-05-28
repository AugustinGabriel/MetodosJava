package lab365.modificadores.defaults;

public class DefaultPessoa {

	private String nome;
	private Integer idade;
	private Integer maioridade = 18;

	// Construtor padrão
	public DefaultPessoa() {
		nome = "Nome (padrão)";
		idade = 15;
	}

	// Construtor com parâmetros
	public DefaultPessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	// Método que retorna o nome
	public String getNome() {
		return nome;
	}

	// Método que retorna a idade
	public Integer getIdade() {
		return idade;
	}

	// Método que incrementa a idade
	void fazAniversario() {
		idade = idade + 1;
		System.out.println(nome + "! Parabéns pelos seus " + idade + " anos de vida!");
	}

	// Método que verifica a maioridade
	public boolean verificaMaioridade() {
		boolean maior = idade >= maioridade;
		if (maior) {
			System.out.println("Com " + idade + " anos, já atingiu a maioridade!");
		} else {
			Integer diferenca = (maioridade - idade);
			if (diferenca > 1) {
				System.out.println("Com " + idade + " anos, faltam " + diferenca + " anos para a maioridade!");
			} else {
				System.out.println("Com " + idade + " anos, falta " + diferenca + " ano para a maioridade!");
			}
		}
		return maior;
	}

}
