package lab365.parametrosretornos;

import java.util.Date;

import lab365.parametrosretornos.modelos.Pessoa;
import lab365.parametrosretornos.servicos.PessoaServico;

public class ParametrosRetornosMain {

	public static void main(String[] args) {
		parametrosRetornos();
		desafioResolvido();
	}

	public static void parametrosRetornos() {
		Pessoa novaPessoa = new Pessoa();
		novaPessoa.setNome("Pessoa");
		novaPessoa.setSobrenome("Nova");
		novaPessoa.setDataNascimento(new Date());
		novaPessoa.setPais("Brasil");

		PessoaServico pessoaServico = new PessoaServico();
		pessoaServico.salvar(novaPessoa);

		novaPessoa = new Pessoa();
		novaPessoa.setNome("Novíssima");
		novaPessoa.setSobrenome("Pessoa");
		novaPessoa.setDataNascimento(new Date());
		novaPessoa.setPais("Argentina");

		pessoaServico.salvar(novaPessoa);

		System.out.println("Primeira consulta");
		System.out.println(pessoaServico.buscarTodasPessoas());

		novaPessoa.setNome("Frederico");

		System.out.println("\n\nÚltima consulta");
		System.out.println(pessoaServico.buscarTodasPessoas());

	}

	public static void desafioResolvido() {
		PessoaServico pessoaServico = new PessoaServico();
		criarPessoas(10);
		System.out.println(pessoaServico.buscarTodasPessoas().size());

		// Criando um rescém nascido
		Pessoa novaPessoa = new Pessoa();
		novaPessoa.setNome("Gabriel");
		novaPessoa.setSobrenome("Augustin");
		novaPessoa.setDataNascimento(new Date());
		novaPessoa.setPais("Brasil");
		pessoaServico.salvar(novaPessoa);

		System.out.println(pessoaServico.buscarTodasPessoas());
	}

	private static void criarPessoas(int quantidadePessoas) {
		PessoaServico pessoaServico = new PessoaServico();
		System.out.println("Criando " + quantidadePessoas + " pessoas...");
		pessoaServico.criarPessoas(quantidadePessoas);
		System.out.println(quantidadePessoas + " pessoas criadas com sucesso!");
	}

}
