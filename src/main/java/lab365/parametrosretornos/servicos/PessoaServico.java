package lab365.parametrosretornos.servicos;

import java.util.List;

import lab365.parametrosretornos.modelos.Pessoa;
import lab365.parametrosretornos.respositorios.PessoaRepositorio;
import lab365.parametrosretornos.servicos.utilidades.PessoaUtil;

public class PessoaServico {

	private PessoaRepositorio repositorio = new PessoaRepositorio();

	public Pessoa salvar(Pessoa pessoa) {
		return repositorio.salvar(pessoa);
	}

	public List<Pessoa> buscarTodasPessoas() {
		return repositorio.buscarTodasPessoas();
	}

	public void criarPessoas(int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			Pessoa pessoa = criarPessoaAleatoria();
			salvar(pessoa);
		}
	}

	public Pessoa criarPessoaAleatoria() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(PessoaUtil.sortearNome());
		pessoa.setSobrenome(PessoaUtil.sortearSobrenome());
		pessoa.setDataNascimento(PessoaUtil.dataNascimentoAleatorio());
		pessoa.setPais(PessoaUtil.sortearPais());
		return pessoa;
	}

}
