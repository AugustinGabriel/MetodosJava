package lab365.modificadores.privates;

public class PrivateMain {

	public static void main(String[] args) {
		utilizandoMetodosPrivate();
	}

	public static void utilizandoMetodosPrivate() {
		PrivatePessoa pessoaComDocumento = new PrivatePessoa();

		pessoaComDocumento.alterarDocumento("00000000000");
		System.out.println("Documento Atual: " + pessoaComDocumento.getDocumento());

		pessoaComDocumento.alterarDocumento(" 111111111    ");
		System.out.println("Documento Atual: " + pessoaComDocumento.getDocumento());

		pessoaComDocumento.alterarDocumento("22222222222");
		System.out.println("Documento Atual: " + pessoaComDocumento.getDocumento());

		pessoaComDocumento.alterarDocumento(null);
		System.out.println("Documento Atual: " + pessoaComDocumento.getDocumento());

		/** 
		 * Descomente os metodos abaixo.
		 * Com isso verá que os métodos não estão visíveis.
		 * 
		 * O motivo é o modificador "private" que 
		 * impede que qualquer outra classe os acesse.
		 */
		// pessoaComDocumento.verificarDocumento("33333333333");
		// pessoaComDocumento.tratarDocumento("44444444444");

	}

}
