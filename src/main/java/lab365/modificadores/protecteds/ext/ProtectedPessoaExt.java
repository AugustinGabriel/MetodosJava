package lab365.modificadores.protecteds.ext;

import lab365.modificadores.protecteds.ProtectedPessoa;

public class ProtectedPessoaExt extends ProtectedPessoa {

	public ProtectedPessoaExt() {
		super();
	}

	public ProtectedPessoaExt(String nome, Integer idade) {
		super(nome, idade);
	}

	@Override
	public void fazAniversario() {
		super.fazAniversario();
	}

}
