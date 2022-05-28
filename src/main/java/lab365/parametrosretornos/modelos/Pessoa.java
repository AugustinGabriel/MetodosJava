package lab365.parametrosretornos.modelos;

import java.util.Date;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private Date dataNascimento;
	private String pais;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "\n" + nome + " " + sobrenome + "\nSeu nascimento foi " + dataNascimento + " (" + pais + ")\n";
	}

}
