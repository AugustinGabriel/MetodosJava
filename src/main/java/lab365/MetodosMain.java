package lab365;

import lab365.modificadores.defaults.DefaultMain;
import lab365.modificadores.privates.PrivateMain;
import lab365.modificadores.protecteds.ProtectedMain;
import lab365.modificadores.protecteds.ext.ProtectedExtMain;
import lab365.modificadores.publics.PublicMain;
import lab365.parametrosretornos.ParametrosRetornosMain;

public class MetodosMain {

	public static void main(String[] args) {
		testandoModificadores();
		testandoParametrosRetornos();
	}

	/** Testando modificadores */
	private static void testandoModificadores() {

		/* Privados */
		PrivateMain.utilizandoMetodosPrivate();

		/* Publicos */
		PublicMain.utilizandoMetodosPublic();

		/* Protegidos */
		ProtectedMain.utilizandoMetodosProtected();
		ProtectedExtMain.utilizandoMetodosProtected();

		/* Padroes */
		DefaultMain.utilizandoMetodosDefault();

	}

	/** Testando parametros e retornos */
	private static void testandoParametrosRetornos() {
		/* Testando parametros */
		ParametrosRetornosMain.parametrosRetornos();

		/* Resolução do desafio */
		ParametrosRetornosMain.desafioResolvido();
	}

}
