package gestaoProdutos;

import java.util.Date;

public class Factura {

	private Date data;
	private int empregadoId;
	private int id;
	private String nif;
	private String nome;

	public Factura() {

	}

	public Factura(Date data, String nome, String nif, int empregadoId) {
		this.data = data;
		this.nome = nome;
		this.nif = nif;
		this.empregadoId = empregadoId;
	}

	public Factura(int id, Date data, String nome, String nif, int empregadoId) {
		this.id = id;
		this.data = data;
		this.nome = nome;
		this.nif = nif;
		this.empregadoId = empregadoId;
	}

	public Date getData() {
		return this.data;
	}

	public int getEmpregadoId() {
		return this.empregadoId;
	}

	public int getId() {
		return this.id;
	}

	public String getNif() {
		return this.nif;
	}

	public String getNome() {
		return this.nome;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setEmpregadoId(int empregadoId) {
		this.empregadoId = empregadoId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
