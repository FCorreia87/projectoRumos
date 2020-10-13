package gestaoProdutos;

import java.math.BigDecimal;

public class LinhaFactura {

	private int facturaId;
	private int id;
	private int iva;
	private BigDecimal precoUnitario;
	private int produtosId;
	private int quantidade;

	public LinhaFactura() {

	}

	public LinhaFactura(int facturaId, int quantidade, int produtosId, int iva, BigDecimal precoUnitario) {
		this.facturaId = facturaId;
		this.quantidade = quantidade;
		this.produtosId = produtosId;
		this.iva = iva;
		this.precoUnitario = precoUnitario;

	}

	public LinhaFactura(int id, int facturaId, int quantidade, int produtosId, int iva, BigDecimal precoUnitario) {
		this.id = id;
		this.facturaId = facturaId;
		this.quantidade = quantidade;
		this.produtosId = produtosId;
		this.iva = iva;
		this.precoUnitario = precoUnitario;

	}

	public int getFacturaId() {
		return this.facturaId;
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

	public int getProdutosId() {
		return this.produtosId;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setFacturaId(int facturaId) {
		this.facturaId = facturaId;
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

	public void setProdutosId(int produtosId) {
		this.produtosId = produtosId;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
