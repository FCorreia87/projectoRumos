package gestaoProdutos;

public class SubCategoria {
	private int categoriaId;
	private String descricao;
	private int id;

	public SubCategoria() {

	}

	public SubCategoria(int id, int categoriaID, String descricao) {

	}

	public SubCategoria(String descricao, int categoriaId) {

	}

	public int getCategoriaId() {
		return this.categoriaId;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public int getId() {
		return this.id;
	}

	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setId(int id) {
		this.id = id;
	}

}