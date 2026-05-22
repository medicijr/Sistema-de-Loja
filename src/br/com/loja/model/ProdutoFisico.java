package br.com.loja.model;

public class ProdutoFisico extends Produto{
    private double peso;

    public ProdutoFisico(String nome, double preco, double peso) {
        super(nome, preco);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public void exibirDetalhes(){
        if (getPeso() >= 1000){
            System.out.println("Produto: "+getNome()+ " / Preço R$: "+getPreco()+" / Peso: "+getPeso()+"kg");
        }else {
            System.out.println("Produto: "+getNome()+ " / Preço R$: "+getPreco()+" / Peso: "+getPeso()+"g");
        }

    }
    public double calcularFrete(){
        return getPreco() * 0.1;

    }
}
