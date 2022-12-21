package Checkpoint1;


public class PecasCarros {
   private String tipo;
   private Integer quantidadeEstoque;
   private Double preco;


    public PecasCarros(String tipo, Integer quantidadeEstoque, Double preco) throws Exception {

        if (quantidadeEstoque < 0 || preco < 0) {
            throw new Exception("Valores negativos não são válidos!");
        }

        this.tipo = tipo;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }


    public String repor() {
        if (quantidadeEstoque >= 10) {
            return "\nestoque de" + " " + tipo + " " + "cheio";

        }else

            return "\nestoque de" + " " + tipo + " " + "acabando, nessário comprar mais peças !!";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Double getPreco() {
        return preco;
    }

    public double setPreco(Double preco) {
        this.preco = preco;
        return preco;
    }
}
