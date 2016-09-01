package br.edu.uricer.negocios;

import java.math.BigDecimal;

public class Item {
    private Produto produto;
    private BigDecimal qtd;
    private BigDecimal valorUnitario;
    private BigDecimal valorTotal;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    public void totalizar(){
        valorTotal = qtd.multiply(valorUnitario).setScale(2);
    }
}
