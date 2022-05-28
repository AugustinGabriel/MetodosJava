package lab365.modificadores.defaults.other;

import lab365.modificadores.defaults.DefaultPessoa;

public class DefaultPessoaOther extends DefaultPessoa {

	public DefaultPessoaOther() {
		super();
	}

	public DefaultPessoaOther(String nome, Integer idade) {
		super(nome, idade);
	}


	/** 
	 * 
	 * Descomente o método abaixo.
	 * Com isso verá que o método não está visível.
	 * 
	 * O motivo é o modificador "default" que 
	 * impede que qualquer outra classe de outros
	 * pacotes o acesse mesmo utilizando herança.
	 * 
	 */
//	@Override
//	public void fazAniversario() {
//		super.fazAniversario();
//	}

}
