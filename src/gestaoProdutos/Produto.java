package gestaoProdutos;

import java.math.BigDecimal;

public class Produto {

	private int categoriaId;
	private String descricao;
	private int gestor;
	private int id;
	private int iva;
	private BigDecimal precoUnitario;
	private int subcategoriaId;

	public Produto() {

	}

	public Produto(int id, String descricao, int iva, BigDecimal precoUnitario, int gestor, int categoriaId,
			int subcategoriaId) {

	}

	public Produto(String descricao, int iva, BigDecimal precoUnitario, int gestor, int categoriaId,
			int subcategoriaId) {

	}

	public int getCategoriaId() {
		return this.categoriaId;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public int getGestor() {
		return this.gestor;
	}

	public int getId() {
		return this.id;
	}

	public int getIva() {
		return this.iva;
	}

	public BigDecimal getPrecoUnitario() {
		return this.precoUnitario;
	}

	public int getSubcategoriaId() {
		return this.subcategoriaId;
	}

	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setGestor(int gestor) {
		this.gestor = gestor;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public void setPrecoUnitario(BigDecimal precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public void setSubcategoriaId(int subcategoriaId) {
		this.subcategoriaId = subcategoriaId;
	}

}
