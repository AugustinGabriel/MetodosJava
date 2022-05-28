package lab365.modificadores.privates;

public class PrivatePessoa {

	private String documento;

	public String getDocumento() {
		return documento;
	}

	public void alterarDocumento(String novoDocumento) {
		System.out.println("\n");
		if (verificarDocumento(novoDocumento)) {
			documento = tratarDocumento(novoDocumento);
			System.out.println("Documento alterado com sucesso!");
		} else {
			System.out.println("Documento inválido!");
		}
	}

	private boolean verificarDocumento(String novoDocumento) {
		if (novoDocumento == null) {
			return false;
		}
		novoDocumento = tratarDocumento(novoDocumento);
		if (novoDocumento.trim().equals("")) {
			return false;
		}
		if (novoDocumento.length() < 11) {
			return false;
		}
		return true;
	}

	private String tratarDocumento(String novoDocumento) {
		return novoDocumento.trim(); // Elimina espaços vazios
	}

}
