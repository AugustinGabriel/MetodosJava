package lab365.parametrosretornos.respositorios;

import java.util.ArrayList;
import java.util.List;

import lab365.parametrosretornos.modelos.Pessoa;

public class PessoaRepositorio {

	// Armazenará as pessoas cadastradas
	private static List<Pessoa> PESSOAS = new ArrayList<>();

	public Pessoa salvar(Pessoa pessoa) {
		PESSOAS.add(pessoa);
		return pessoa;
	}

	public void apagar(Pessoa pessoa) {
		PESSOAS.remove(pessoa);
	}

	public List<Pessoa> buscarTodasPessoas() {
		return PESSOAS;
	}

}
