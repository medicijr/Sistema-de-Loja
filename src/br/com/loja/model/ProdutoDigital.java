package br.com.loja.model;

public class ProdutoDigital extends Produto {
    private int tamanhoMb;

    public ProdutoDigital(String nome, double preco, int tamanhoMb) {
        super(nome, preco);
        this.tamanhoMb = tamanhoMb;
    }

    public int getTamanhoMb() {
        return tamanhoMb;
    }

    public void setTamanhoMb(int tamanhoMb) {
        this.tamanhoMb = tamanhoMb;
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("Produto: "+getNome()+ " / Preço R$: "+getPreco()+" / Tamanho MB: "+getTamanhoMb());
    }
    public void gerarLink(){
        System.out.println("Link gerado para: " + getNome() +
                " → https://loja.com/download/" + getNome().toLowerCase().replace(" ", "-"));
    }
}
