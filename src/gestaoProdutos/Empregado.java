package gestaoProdutos;

public class Empregado {

	private boolean admin;
	private int id;
	private String nome;

	public Empregado() {
	}

	public Empregado(int id, String nome, boolean admin) {
		this.id = id;
		this.nome = nome;
		this.admin = admin;
	}

	public Empregado(String nome, boolean admin) {
		this.nome = nome;
		this.admin = admin;
	}

	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public boolean isAdmin() {
		return this.admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
