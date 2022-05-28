package lab365.parametrosretornos.servicos.utilidades;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class PessoaUtil {

	private static Random RANDOM = new Random();

	public final static List<String> NACIONALIDADES = Arrays.asList("Canadá", "Austrália", "Japão", "Alemanha",
			"Brasil", "Itália", "Nova Zelândia");

	public final static List<String> NOMES = Arrays.asList("Miguel", "Arthur", "Gael", "Heitor", "Theo", "Davi",
			"Gabriel", "Bernardo", "Samuel", "João", "Rafael", "Helena", "Alice", "Laura", "Aline", "Maria",
			"Valentina", "Heloísa", "Clara", "Cecília", "Julia", "Sophia", "Ana", "Enzo", "Pedro", "Luiz", "Manueli",
			"Paola", "Pablo", "Vitor", "Leonardo", "Eluize", "Otávio", "Renata", "Daniela");

	public final static List<String> SOBRENOMES = Arrays.asList("Silva", "Santos", "Oliveira", "Souza", "Rodrigues",
			"Ferreira", "Alves", "Pereira", "Lima", "Gomes", "Costa", "Ribeiro", "Martins", "Carvalho", "Almeida",
			"Lopes", "Soares", "Fernandes", "Vieira", "Barbosa", "Rocha", "Dias", "Nascimento", "Andrade", "Moreira",
			"Nunes", "Marques", "Machado", "Mendes", "Freitas", "Cardoso", "Ramos", "Gonçalves", "Santana", "Teixeira");

	private static String sortear(List<String> lista) {
		Integer intervalo = lista.size();
		Integer posicao = RANDOM.nextInt(intervalo);
		return lista.get(posicao);
	}

	public static String sortearPais() {
		return sortear(NACIONALIDADES);
	}

	public static String sortearNome() {
		return sortear(NOMES);
	}

	public static String sortearSobrenome() {
		return sortear(SOBRENOMES);
	}

	public static Date dataNascimentoAleatorio() {
		Integer subtrairAnos = RANDOM.nextInt(99) * -1;
		Integer subtrairMeses = RANDOM.nextInt(12) * -1;
		Integer subtrairDias = RANDOM.nextInt(30) * -1;

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, subtrairAnos);
		cal.add(Calendar.MONTH, subtrairMeses);
		cal.add(Calendar.DAY_OF_MONTH, subtrairDias);

		return cal.getTime();
	}

	private PessoaUtil() {
		// Classe com construtor privado não pode ser instânciada
	}

}
